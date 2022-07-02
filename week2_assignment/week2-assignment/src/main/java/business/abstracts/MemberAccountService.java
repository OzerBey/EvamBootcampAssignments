package business.abstracts;

import entities.MemberAccount;
import utilities.excepitions.InsufficientBalanceException;

import java.util.List;

public interface MemberAccountService {

    MemberAccount addAccount(MemberAccount memberCode);

    MemberAccount deleteAccount(String memberCode);

    MemberAccount updateAccount(String memberCode, MemberAccount memberAccount) throws InsufficientBalanceException;

    MemberAccount getByMemberCode(String memberCode);

    List<MemberAccount> getAllAccounts();
}
