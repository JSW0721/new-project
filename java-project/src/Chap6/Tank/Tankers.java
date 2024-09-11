package Chap6.Tank;

public class Tankers extends Tank{
    public static void main(String[] args){
        Tankers Tankers = new Tankers();
        System.out.println(Tankers.company);
        //System.out.println(Tankers.model);
        //모델은 변수 선언시 private으로 선언을 했기 때문에 접근 불가.
    }
}
