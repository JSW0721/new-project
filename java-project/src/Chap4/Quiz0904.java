package Chap4;

public class Quiz0904 {
    public static void main(String[] args) {
        int[] array = {12, 4, 7, 20, 1};
        double sum = 0;
        int max = array[0];
        for(int i = 0 ; i < array.length ; i++){
            sum += array[i];
        }
        for(int i = 0 ; i < array.length ; i++ ){
            if (max < array[i]){max = array[i];}
        }
        double avg = sum / array.length;
        System.out.println(avg);
        System.out.println(max);
    }
}
