package Chap9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceSamole {
    public static void main(String[] args) {
        //file읽어오는 로직
        String filename = "file1.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine();
        }catch(IOException e){
            System.out.println("IO Exception 발생");
        }
    }
}
