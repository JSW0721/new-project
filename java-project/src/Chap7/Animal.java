package Chap7;

public class Animal {
    String name;

    void setName(String name){
        this.name = name;
    }

    void sleep(){
        System.out.println(this.name + "Zzz...");
    }
    
    Animal(){
        System.out.println("Animal 객체 생성");
    }
}
