package Chap7;

public class InheritABEx {
    public static void main (String[] args){
        InheritB inheritB = new InheritB();
        inheritB.field1 = 10;
        inheritB.method1();

        inheritB.field2 = 30;
        inheritB.method2();
    }
}
