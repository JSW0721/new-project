package Chap11.HashTable;
import java.util.*;

public class HashTableEx {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();
        map.put("spring", "qwer"); //실무에서는 비번은 다 암호화 처리.
        map.put("sumer", "qwer1234");
        map.put("fall", "qwer123");
        map.put("winter", "qwe123");

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter ID: ");
            String id = sc.nextLine();

            System.out.print("Enter PassWord: ");
            String pw = sc.nextLine();

            if(map.containsKey(id)){
                if(map.get(id).equals(pw)){
                    System.out.println("Access Authorized");
                    break;
                }else{
                    System.out.println("Access Denied : Incorrect Password");
                }
            }else{
                System.out.println("Access Denied : Incorrect ID");
            }
        }
    }
}
