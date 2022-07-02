package business.abstracts;

import utilities.Response;
import utilities.excepitions.InsufficientBalanceException;

import java.util.Date;

public interface BillService {

    Response pay(int billType, String memberCode, double amount, Date date) throws InsufficientBalanceException;

    Response getBill(int billType, String memberCode);

    Response getBill(int billType, String memberCode, Date date);

    Response cancelPayment(int billType, String memberCode, double amount, Date date);
}
