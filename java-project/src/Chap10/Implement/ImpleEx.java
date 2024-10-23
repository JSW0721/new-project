package Chap10.Implement;

import java.util.ArrayList;

public class ImpleEx {
    public static void main(String[] args){
        StorageImpl<String> storage = new StorageImpl<>(10);
        storage.add("첫번째",0);
        storage.add("두번째",1);
        storage.add("세번째",2);

        String result = storage.get(3);
        System.out.println(result);

        ArrayList<String> sl = new ArrayList<>();
        sl.add(0,"str1");
        sl.add(1,"str2");
        sl.get(1);
    }
}
