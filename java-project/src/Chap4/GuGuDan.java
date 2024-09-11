package Chap4;

public class GuGuDan {
    public static void main(String[] args) {
        for(int i = 2; i < 10 ; i++){
            for(int j = 1; j < 10 ; j++){
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }

        for(int x = 0; x < 4 ; x++){
            for(int y = 0; y < 4 ; y++){
                for(int z = 0; z < 4 ; z++){
                    System.out.println("x축 좌표 : " + x + " y축 좌표 :" + y + " z축 좌표 :" + z);
                }
            }
        }
    }
}
