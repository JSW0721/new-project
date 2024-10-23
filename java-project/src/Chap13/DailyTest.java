package Chap13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DailyTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> coll1 = numbers.stream()
                .map(n -> n * n).toList();
        System.out.println(coll1);

        List<String> sentences = Arrays.asList("Hello:world", "Java:Stream:flatMap","Functional:programming");
        List<String> coll2 = sentences.stream().flatMap(e -> Arrays.asList(e.split(":")).stream()).toList();
        System.out.println(coll2);

        List<List<Integer>> num2 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> coll3 = num2.stream().flatMap(e -> e.stream()).toList();
        System.out.println(coll3);


    }
}
