package Chap11.HashSet;

import java.util.*;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> hashset = new HashSet();

        //1. 값 입력
        hashset.add("카리나");
        hashset.add("센타우레이시");
        hashset.add("카리나");

        //2. 값 검색
        System.out.println("총 개수 : " + hashset.size());
        //int i를 이용한 for문은 사용 불가(순서 보장 하지 않기 때문)
        for (String str : hashset) {
            System.out.println("\t" + str);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        Iterator<String> it = hashset.iterator();
        while (it.hasNext()) {//해쉬셋에서 다음 항목이 있을때
            String element = it.next();
            System.out.println("\t" + element);
        }
        it.remove();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        while (it.hasNext()) {//해쉬셋에서 다음 항목이 있을때
            String element = it.next();
            System.out.println("\t" + element);
        }
        System.out.println("코드 끝");

        Member member1 = new Member("홍길동",30);
        Member member2 = new Member("홍길동",40);
    }
}
