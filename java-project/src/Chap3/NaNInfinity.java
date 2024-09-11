package Chap3;

public class NaNInfinity {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 0;

        System.out.println(a / b);  //Infinity
        System.out.println(a % b);  //NaN

        System.out.println(Double.isInfinite(a/b));
        System.out.println(Double.isNaN(a%b));

        System.out.println("--------------------------");

        System.out.println("Hello" + 123 + 456);
        System.out.println(123 + 456 + "Hello");

        int num = -8;
        System.out.println(num>>1);
        System.out.println(num>>>1);

    }
}
