package Chap4;

import java.util.ArrayList;

public class ForEachSample {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three", "four"};

        for(String number : numbers){
            System.out.println(number);
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for(Integer i : list){
            System.out.println(i);
        }
    }
}
