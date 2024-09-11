package Chap5;

public class OuterClass {
    public static void main(String[] args) {
        System.out.println(ClassInstanceVariable.index);//클래스 변수에 접근 가능

         ClassInstanceVariable object = new ClassInstanceVariable();
         System.out.println(object.index2);  //인스턴스 변수는 객체 선언후 접근이 가능.
    }
}
