package Chap9.UserException;

public class Account {
    long balance;
    Account(long balance) {
        this.balance = balance;
    }
    void deposit(long money) {
        this. balance += money;
    }
    void withdraw(long money) throws BalanceInsufficientException{
        if (balance < money){
            throw new BalanceInsufficientException("오카네가 나인다. 남은 잔고 : " + balance);
        }
        balance -= money;
    }
}
