package chap01;
import java.util.HashMap;

public class Sample {
    //코드를 작성할 수 있습니다.
    public static void main(String[] args) {
        byte a = 127;
        int b = 127;
        for(int i = 0; i<5;i++){
            a++;
            b++;
            System.out.println(i + "a = " + a);
            System.out.println(i + "b = " + b);
        }
    }
}

