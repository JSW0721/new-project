package chap2;

import java.util.ArrayList;

public class AutoBoxingExample {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();

        //autoboxing
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println("ArrayList" + arrayList);
    }
}
