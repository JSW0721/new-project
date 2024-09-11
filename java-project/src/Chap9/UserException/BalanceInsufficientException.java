package Chap9.UserException;

public class BalanceInsufficientException extends Exception {
    BalanceInsufficientException() {

    }
    public BalanceInsufficientException(String message) {
        super(message);
    }
}
