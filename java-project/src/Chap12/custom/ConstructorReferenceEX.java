package Chap12.custom;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceEX {
    public static void main(String[] args) {
        Function<String, Member> func = (x) -> new Member(x);
        //생성자 참조 위랑 아래랑 같은 의미.
        func = Member::new;
        func.apply("String");

        BiFunction<String, String, Member> Bifunc = (x,y) -> new Member(x,y);
        //생성자 참조 위랑 아래랑 같은 의미.
        Bifunc = Member::new;
        Bifunc.apply("1","2");
    }
}
