package Test0910;

public class CreditCard implements Payment{
    private String cardNumber;

    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }
    public void processPayment(double amount){
        System.out.println("Processing credit card payment of $" + amount + " using card number: " + cardNumber);
    };
}
