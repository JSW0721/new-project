package Chap12.custom;

import java.util.function.IntBinaryOperator;

public class MethodReference {
    public static void main(String[] args) {
        IntBinaryOperator op;

        //정적메소드 호출
        op = (left, right) -> Calculator.staticMethod(left,right);
        op = Calculator::staticMethod;
        System.out.println("정적 메소드 출력 결과 :"+op.applyAsInt(1,2));

        //인스턴스 메소드 호출
        Calculator cal = new Calculator();
        op = (left, right) -> cal.method(left,right);
        op = cal::method;
        System.out.println("인스턴스 메소드 출력 결과 : "+op.applyAsInt(3,5));
    }
}
