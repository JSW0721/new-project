package Chap7.Override;

public class Calculator {
    private static final double PI = 3.141592;

    double areaCircle(double r){
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return PI*r*r;
    }
}
