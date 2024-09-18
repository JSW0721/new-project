package Chap9.UserException;

public class BankTransaction {
    public static void main(String[] args){
        Account accountA = new Account(30000);
        Account accountB = new Account(3000);
        accountA.deposit(40000);
        accountB.deposit(5000);

        int money = 50000;
        try{
            accountA.withdraw(100000);
            accountB.withdraw(-100000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Process End. Deposit : " );
        }
    }
}
