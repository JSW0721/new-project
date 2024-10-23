package Chap13;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MappingEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c","d","e");
        list.stream().map(element -> element.toUpperCase()).forEach(System.out::println);

        //flat mao 2D->1D
        Integer[][] array = {{3,4},{1,2,}};
        Arrays.stream(array).flatMap(element -> Arrays.stream(element)).forEach(System.out::println);//3412

        //flatmap
        List<String> sent1 = Arrays.asList("Hello World", "Java Stream");
        String[] strArray1 = {"Hello", "World"};
        String[] strArray2 = {"Java", "Stream"};
        sent1.stream().flatMap(element -> Arrays.stream(element.split(" ")))//문자열들을 흩어서 각각의 문자로 보여줌
                .forEach(System.out::println); //[Hello, World, Java, stream]

        List<String> sent2 = Arrays.asList("Hello World", "Java Stream");
        List<String> collect = sent2.stream().flatMap(element -> Arrays.stream(element.split("")))
                                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
