package business.concretes;

import business.abstracts.BillService;
import entities.MemberAccount;
import utilities.Response;
import utilities.excepitions.InsufficientBalanceException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client implements BillService {

    private MemberAccountManager memberAccountManager;

    public Response successProcess() {
        Date now = new Date();
        DateFormat stringNow = new SimpleDateFormat("yyyy/MM/dd");
        return new Response("0", stringNow.format(now));
    }

    @Override
    public Response pay(int billType, String memberCode, double amount, Date date) throws InsufficientBalanceException {

        for (MemberAccount account : memberAccountManager.getAllAccounts()) {
            if (account.getMemberCode().equals(memberCode)) {
                if (account.getBalance() < amount) {
                    throw new InsufficientBalanceException("Insufficient Balance");
                }
            }
        }
        return null;
    }

    @Override
    public Response getBill(int billType, String memberCode) {
        return null;
    }

    @Override
    public Response getBill(int billType, String memberCode, Date date) {
        return null;
    }

    @Override
    public Response cancelPayment(int billType, String memberCode, double amount, Date date) {
        return null;
    }
}
