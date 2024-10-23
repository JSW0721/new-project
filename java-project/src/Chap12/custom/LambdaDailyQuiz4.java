package Chap12.custom;

import java.util.function.IntSupplier;

public class LambdaDailyQuiz4 {
    public static int method(int x, int y) {
        IntSupplier supplier = () -> {
            //x *= 10;
            int a = x * 10;
            return a + y;
        };
        int result = supplier.getAsInt();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(method(3, 5));
    }
}

