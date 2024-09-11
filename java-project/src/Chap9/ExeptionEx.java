package Chap9;

import java.io.*;

public class ExeptionEx {
    public static void main(String[] args) throws IOException {
        //int b = Integer.parseInt(args[0]);
        //int result = 10/b; //예외 발생 가능성이 있는 코드(예외처리 필요)

        //존재하지 않는 데이터를 읽어오는 코드
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\정승원\\workspace\\java-project\\src\\Chap9\\example.txt"));
        reader.readLine();
        reader.close();
    }
}
