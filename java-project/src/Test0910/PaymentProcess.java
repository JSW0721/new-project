package Test0910;

public class PaymentProcess {
    public static void main(String[] args) {
        Payment ccd = new CreditCard("5678-9012");//클래스로 정의 할때 인터페이스 자체를 객체로서 가질 수 있기 때문에 가능.
        CreditCard cc = new CreditCard("1234-5678");
        cc.processPayment(6500000);

        Payment pp2 = new PayPal("abcd@efgh.com");
        PayPal pp = new PayPal("email@aws.com");
        pp.processPayment(7200000);
    }
}
