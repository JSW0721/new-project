package Chap12.custom;

import java.util.function.ToIntBiFunction;

public class MethodParameterReferenceEx {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> func;

        func = String::compareToIgnoreCase;
        System.out.println(func.applyAsInt("a","A"));

    }
    static void print(int order){
        if(order < 0) {
            System.out.println("사전순으로 먼저 옵니다.");
        }else if(order == 0){
            System.out.println("사전순으로 나중에 옵니다.");
        }
    }
}
