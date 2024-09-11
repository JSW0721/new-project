package Test0910;

public class PayPal implements Payment {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }
    @Override
    public void processPayment(double amount) {
        //amount 결제 로직
        System.out.println("Processing PayPal payment of $ " + amount + " Using E-mail address "+ email);
    }
}
