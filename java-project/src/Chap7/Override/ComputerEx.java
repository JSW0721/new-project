package Chap7.Override;

public class ComputerEx {
    public static void main(String[] args) {
        Computer com = new Computer();
        System.out.println("computer.areaCircle: "+com.areaCircle(4));

        Calculator cal = new Calculator();
        System.out.println("cal.areaCircle: "+cal.areaCircle(4));
    }
}
