package Chap9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class newIOEx{
    public static void main(String[] args) {
        newIOEx nioex = new newIOEx();
        try{
            nioex.readfile();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public void readfile() throws IOException{
            BufferedReader reader = new BufferedReader(new FileReader(""));
            System.out.println(reader.readLine());
            reader.close();
    }
}
