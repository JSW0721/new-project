package Chap4;

public class ArgsArrayEX {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("----------------------");
        for(String args1 : args){
            System.out.println(args1);
        }
    }
}
