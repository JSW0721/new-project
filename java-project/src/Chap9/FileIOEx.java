package Chap9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOEx {
    public static void main(String[] args) {
        int b = Integer.parseInt(args[0]);
        String file = System.getProperty("user.dir");//현재 작업하고 있는 프로그램 루트를 찾움
        String filename = file + "/file1.txt";//불러올 파일을 찾아옴.

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {//파일 내용 읽어오는 코드 작성
            //String path = FileIOEx.class.getResource("").getPath();
            //System.out.println("path: " + path);
            int result = 5 / b ; //ArithmeticException 발생 가능
            //BufferedReader reader = new BufferedReader(new FileReader(filename));
            System.out.println(reader.readLine());
            reader.close();//리더 관련 작업시 반드시 닫아주는 작업이 있어야 파일 누수 없음.
        }catch(FileNotFoundException e) {
            System.out.println("File not found");
        }catch(IOException e) {
            System.out.println("I/O exception");
        }catch(ArithmeticException e) {
            System.out.println("Arithmetic exception");
            //예외 출력물만 남길때 (로깅)
        }finally{
            try{
                //reader.close();
            }catch (Exception e){
            System.out.println("finally end");
            }
        }
    }
}