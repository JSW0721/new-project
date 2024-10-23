package Chap13.Optional;

import java.util.*;
//npe방지 optional 테스트
public class optionalEx {
    public static void main(String[] args) throws NoSuchFieldException {
        List<String> nulllist = null;

        //Optional
        Optional<List<String>> op = Optional.ofNullable(nulllist);
        op.orElseGet(Collections::emptyList).forEach(System.out::println);

        Optional.ofNullable(nulllist).orElseGet(Collections::emptyList).forEach(System.out::println);

        //optional 객체생성(empty(). of(), ofNullable())
        Optional<Integer> empty = Optional.empty();
        OptionalInt empty2 = OptionalInt.empty();
        OptionalDouble empty3 = OptionalDouble.empty();

        Optional<Integer> opt2 = Optional.of(456);
        Optional<Integer> opt3 = Optional.ofNullable(1215);

        //Optional 객체 꺼내기 get(),orElse(). orElseGet(), orElseThrow()
        Integer value  ;
        Integer i = opt3.orElseThrow(NoSuchFieldException::new);
        System.out.println(i + "객체 꺼내기");

        //is Present()
        if(opt3.isPresent()){
            Integer intg = opt3.get();
            System.out.println(intg + "opt3가 있으면 opt3의 값 불러오기");
        }
        if(opt2.isPresent()){
            Integer intg = empty.orElseGet(opt2::orElseThrow);
            System.out.println(intg + ".orElseGet으로 opt2꺼내기");
        }
    }
}
