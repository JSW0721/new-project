package Chap4;

public class ContinueEx {
    public static void main(String[] args){
        for(int i = 1 ; i <=60 ; i++){
            if(i % 3 != 0){
                continue;
            }
            System.out.println(i);
            System.out.println("-----------------");
            for(int j = 1 ; j <=60 ; j++){
                if(j % 3 == 0){
                    System.out.println(j);
                }
            }
        }
    }
}
