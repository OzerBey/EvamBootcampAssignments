package business.concretes;

import business.abstracts.MemberAccountService;
import entities.MemberAccount;
import utilities.excepitions.InsufficientBalanceException;

import java.util.ArrayList;
import java.util.List;

public class MemberAccountManager implements MemberAccountService {

    //fake member db - members list
    private List<MemberAccount> members = new ArrayList<>(); // fake database simulation


    // add a new member account
    @Override
    public MemberAccount addAccount(MemberAccount memberCode) {
        members.add(memberCode);
        return memberCode;
    }

    //delete member account
    @Override
    public MemberAccount deleteAccount(String memberCode) {
        for (MemberAccount member : members) {
            if (member.getMemberCode().equals(memberCode)) {
                members.remove(member);
                System.err.println("! Member deleted from database");
            }
        }
        return null;
    }

    //update member account
    @Override
    public MemberAccount updateAccount(String memberCode, MemberAccount memberAccount) throws InsufficientBalanceException {
        for (MemberAccount member : members) {
            if (member.getMemberCode().equals(memberCode)) {
                //member.setMemberCode(memberAccount.getMemberCode());
                member.setName(memberAccount.getName());
                member.setSurname(memberAccount.getSurname());
                member.setBalance(memberAccount.getBalance());
                member.setPhoneNumber(memberAccount.getPhoneNumber());
            }
        }
        return null;
    }

    // get by member code from fake database [member list]
    @Override
    public MemberAccount getByMemberCode(String memberCode) {
        for (MemberAccount member : members) {
            if (member.getMemberCode().equals(memberCode)) {
                return member;
            }
        }
        return null;
    }

    // get all member list
    @Override
    public List<MemberAccount> getAllAccounts() {
        return members;
    }
}
