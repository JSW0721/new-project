package Caap10;

import java.util.ArrayList;

public class Sample {
    void test{
        ArrayList<String> List = new ArrayList<>();
        List.add("10");
        List.add("12.45");//ArrayList를 제네릭으로 생성한 경우 해당 타입에 맞는 데이터 타입이 아니면 오류 표시로 알려줌.

        ArrayList List2 = new ArrayList();
        List2.add(10);
        List2.add(12.45);
        List2.add("문자열");
    }
}
