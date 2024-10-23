package Chap13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "a", "b");
        list.stream().distinct().forEach(System.out::println);

        List<String> sentences = Arrays.asList("김밥", "김밥", "김치", "나비", "나방");
        sentences.stream()
                .filter(x -> x.startsWith("김"))
                .distinct()
                .forEach(System.out::println);
    }
}
