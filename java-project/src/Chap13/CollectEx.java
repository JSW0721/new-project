package Chap13;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5, 5);

        Map<Integer, Long> result = list.stream()
                .collect(
                        Collectors.groupingBy(
                                n -> n,
                                Collectors.counting()  // 그룹핑 후 집계하는 메소드
                        )
                );

        /*
         * 1: 2개
         * 2: 3개
         * 3: 1개
         * 4: 1개
         * 5: 3개
         */
        result.forEach((key, value) -> System.out.println(key + ": " + value + "개"));
        //수집 - collect() -> 각 요소를 그룹핑 -> 최종적으로 Map 객체로 반환
    }
}
