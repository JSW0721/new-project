package Chap11.Map;

import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {
        //1.객체 선언, 키, 밸류값 추가
        Map<String,Integer> hm = new HashMap<>();
        hm.put("홍길동",10);
        hm.put("윈터",12);
        hm.put("윈터",13);

        System.out.println("Key가 있을까? " + hm.get("Key"));
        System.out.println("key라는 키값이 있나? 없으면 defalt vale인 0, 있으면 있는 수만큼 return "
                + hm.getOrDefault("key",0));
        System.out.println("hm의 사이즈는? : "+hm.size());
        //2. 각 키, 값 순회하면서 출력 => KeySet() 메소드 이용
        Set<String> ks = hm.keySet();
        for(String  k: ks){
            Integer value = hm.get(k);
            System.out.println(k + " : " + value);
        }

        System.out.println("======================================");
        //3. 각 키, 값 순회하면서 출력 => entrySet() 메소드 이용
        Set<Map.Entry<String,Integer>> es = hm.entrySet();//키와 값으로 묶인 세트
        Iterator<Map.Entry<String,Integer>> it = es.iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> entry = it.next();
            System.out.println("\t" + entry.getKey() + " : " + entry.getValue());
        }


    }
}
