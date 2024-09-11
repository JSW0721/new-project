package Chap8.Inherit;

public class InplementsC implements InterfaceC{
    @Override
    public void methodC(){
        System.out.println("ImplementsC.methodC");
    }
    @Override
    public void methodA(){
        System.out.println("ImplementsA.methodA");
    }
    @Override
    public void methodB(){
        System.out.println("ImplementsB.methodB");
    }
}
