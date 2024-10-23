package Chap13.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalEx2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //NoSuchElementException 발생
        OptionalDouble od = list.stream()
                .mapToInt(Integer::intValue)
                .average();

        od.ifPresent(avg -> System.out.println(avg));

        double result = od.orElse(0.0);
        System.out.println(result);

        if(od.isPresent()){
            double avg = od.getAsDouble();
            System.out.println(avg);//예외 처리는 해줬지만 아무것도 안나옴
        }
    }
}
