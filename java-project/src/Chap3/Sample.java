package Chap3;

public class Sample {
    public static void main(String[] args) {
        int x = 14;
        int result = --x;
        System.out.println(result);
        System.out.println(--x);

        int a = 10;
        int b = 3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        int result2 = a % b;
        System.out.println(result2);

        System.out.println("---------------------------------------");

        byte c = 45;
        byte d = 67;

        int result3 = c + d;
        System.out.println(result3);

        int result4 = c + d;

        System.out.println("---------------------------------------");

        int x2 = 40;
        double y2 = 50.34;

        int result5 = (int)(x2+y2);
        double result6 = x2+y2;
        System.out.println(result5);
        System.out.println(result6);
    }
}
