package Chap11.List;

import java.util.*;

public class LinkedListEx {
    public static void main(String[] args){
        List<String> list = new LinkedList<>();

        //list에 데이터 추가
        list.add("Java");
        list.add("Spring");
        list.add("Servlet/JSP");
        list.add("DBMS");
        list.add("JPA");

        //총 개수의 확인
        System.out.println("항목의 총 갯수 : " + list.size());

        //전체 조회하면서 출력
        for (int i = 0; i < list.size(); i++){
            System.out.println("\t" + i + " : " + list.get(i));
        }

        //값의 삭제
        list.remove(2);
        list.remove(2);//해당 번째 데이터값 삭제 하면 뒤의 데이터를 당겨서 해당 자리에 채움.

        for(String element : list){
            System.out.println("\t" + element);
        }
    }
}
