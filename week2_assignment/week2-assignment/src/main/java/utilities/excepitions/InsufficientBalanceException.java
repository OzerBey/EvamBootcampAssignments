package utilities.excepitions;

public class InsufficientBalanceException extends CustomException {

    //Special exception for insufficient balance
    public InsufficientBalanceException(String message) {
        super("Insufficient Balance");
    }
}
