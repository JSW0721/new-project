package Chap11.Stack;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Coin> cs = new Stack<Coin>();
        cs.push(new Coin(500));
        cs.push(new Coin(100));
        cs.push(new Coin(50));
        cs.push(new Coin(10));
        cs.push(new Coin(5));
        cs.push(new Coin(1));

        System.out.println(cs.peek());
        System.out.println(cs.peek());
        System.out.println(cs.peek());
        System.out.println(cs.peek());
        System.out.println(cs.peek());
        System.out.println(cs.peek());
    }
}
