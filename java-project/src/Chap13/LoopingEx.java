package Chap13;

import java.util.Arrays;
import java.util.List;

public class LoopingEx {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        //짝수를 찾아서 총 합 구하기
        int sum = list.stream().mapToInt(e->e).filter(e->e%2==0).peek(System.out::println).sum();
        System.out.println("짝수들의 총 합" + sum);

        //forEach()사용
        List<Integer>list2 = Arrays.asList(1,2,3,4,5);
        list2.stream().filter(x->x%2==0).forEach(System.out::println);
    }
}
