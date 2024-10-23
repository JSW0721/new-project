package Chap13;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) throws IOException {
        //1. 컬렉션을 통한 스트림 생성
        List<String> list = Arrays.asList("1","2","3","4");
        Stream<String> stream = list.stream();

        //2. 배열로 스트림 생성
        String[] strarr = {"1","2","3","4"};
        Stream<String> stream2 = Arrays.stream(strarr);

        //3. 숫자 범위 스트림 생성
        IntStream intstr = IntStream.rangeClosed(5, 5);
        LongStream longstr = LongStream.range(1, 5);
        DoubleStream doublestr = DoubleStream.of(1,2,3);

        //4. 파일을 통한 스트림 생성
        Stream<String> fs = Files.lines(Paths.get("file1.txt"), Charset.forName("UTF-8"));
        fs.forEach(System.out::println);

        //5. 스트림 열결해서 하나의 스트림 생성
        Stream<Integer> intStream = Stream.of(1,2,3);
        Stream<Integer> intStream2 = Stream.of(4,5,6);
        Stream<Integer> concated = Stream.concat(intStream,intStream2);
        concated.forEach(System.out::println);
    }
}
