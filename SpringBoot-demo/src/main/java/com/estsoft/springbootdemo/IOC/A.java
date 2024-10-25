package com.estsoft.springbootdemo.IOC;

public class A {
    Inter inter;
    public A(Inter inter){
        this.inter = inter;
    }

    public void mwthod(){

        B objectB = new B();//objectB를 객체로 직접 호출
        objectB.methodB();

        C objectC = new C(); //만약 기능을 바꾸고 싶다면 이런식으로 메인 로직들을 바꿔줘야 함.
        objectC.methodC();
    }

    public void method2(){//생성자에서 받고 있는 인터페이스만 바꿔주면 됨.
        inter.method();
    }
}
