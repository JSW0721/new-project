package Chap12.custom;

public class LambdaEx {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run(){
                System.out.println("일반코딩으로 구현함 / 익명 구현 객체의 메서드");
            }
        };//익명 구현 개체
        //이 코드가 람다식으로 표현한 아래 코드와 같다
        Runnable run1 = () -> System.out.println("람다식으로 구현함 / 익명 구현 객체의 메서드");
    }
}
