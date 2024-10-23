package Chap12.custom;

import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class LambdaEx2 {
    public static void main(String[] args) {
        Supplier<String> sup1 = () -> "str";
        String getstr = sup1.get();
        System.out.println(getstr);

        IntSupplier sup2 = () -> 123;
        int getint = sup2.getAsInt();
        System.out.println(getint);

        IntConsumer sup3 = (int a) -> System.out.println(a);

        Function<Integer, String> sup4 = x -> x + ":문자열";
        System.out.println(sup4.apply(345));

        Function<String, Double> func2 = x -> Double.valueOf(x) * 3.14;
        Double resultfunc2 = func2.apply("56.7");
        System.out.println("String to Double : " + resultfunc2);
    }
}
