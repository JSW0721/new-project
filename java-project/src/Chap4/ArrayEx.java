package Chap4;

public class ArrayEx {
    public static void main(String[] args) {
        String[] arraylist = new String[2];
        arraylist[0] = "첫번째";
        arraylist[1] = "두번째";
        System.out.println(arraylist[1]);

        String[] arraylist2 = {"첫번째", "두번째"};
        System.out.println(arraylist2[0] + " " + arraylist2[1]);

        System.out.println(arraylist2.length);
    }
}
