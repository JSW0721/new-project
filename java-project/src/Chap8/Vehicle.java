package Chap8;

public interface Vehicle {
    void run();
    int speed = 0; //static final의 상태로 상수가 선언됨. 일반 상수로는 불가능.
/*   인터페이스는 일반 메소드는 가질 수 없음.
        double sum(){
        return 0;
    }*/
}
