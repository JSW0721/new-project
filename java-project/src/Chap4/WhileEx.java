package Chap4;

public class WhileEx {
    public static void main(String[] args) {
        int i = 1;
        while(i<11){
            System.out.println("나무를" + i +"번 찍었습니다.");
            i++;
        }
        System.out.println("나무가 넘어갑니다.");
        int j = 0;
        while(j < 61){
            j++;
            if(j % 3 != 0){continue;}
            System.out.println(j);
        }
    }
}
