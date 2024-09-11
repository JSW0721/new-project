package Chap6;

public class Calculator {
    int a;

    Calculator(){
        //default 생성자
    }
    Calculator(int a){
        this.a = a;
    }
    int postfixOperator(int a){
        a++;
        return a;
    }

    void postfixOperator(){ this.a++; }

    void postfixOperator(Calculator cal){
        cal.a++;
    }

    public static void main(String[] args) {
        int a = 1;
        Calculator calculator = new Calculator();
        int result = calculator.postfixOperator(a);//메소드 타입변경
        System.out.println(result);//2

        int a2 =1;
        Calculator cal1 = new Calculator();
        cal1.postfixOperator(cal1);
        System.out.println(cal1.a);
    }
}
