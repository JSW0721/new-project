package Chap5;
import java.util.*;

public class TEST09052 {
    public static void main(String[] args) {
/*        String str = "aaaabbccd";
        int count = 0;
        String strarr[] = str.split("");
        String ansarr[] = new String[strarr.length];

         for(int i = 0; i < strarr.length-1; i++){
             if(strarr[i]==strarr[i+1]){
                 count++;
             }else{
                 strarr[i] = strarr[i+1];
             }
         }*/
        int[] arr = {1,3,2,5,4};
         Arrays.sort(arr);
         int[] arrsort = new int[arr.length];
         for(int i = 0; i < arr.length; i++){
             arrsort[i] = arr[i];
             System.out.print(arrsort[i]);
         }
    }
}
