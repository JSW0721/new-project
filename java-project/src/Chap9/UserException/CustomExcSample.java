package Chap9.UserException;

public class CustomExcSample {
    void method() throws BalanceInsufficientException{
        throw new BalanceInsufficientException("오카네가 나인다.");
    }
}
