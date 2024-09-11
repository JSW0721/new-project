package Chap7;

public class Dog extends Animal{

    @Override
    void sleep() {
        //부모 메소드의 메서드 소환
    }

    void sleep(int times){
        System.out.println(name + " Zzz..." + times + " hours sleep");
    }
    
    Dog(String name){
        System.out.println("Dog 객체 생성, name : " + name);
    }
}
