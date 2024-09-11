package chap2;

public class Sampke2 {
    public static void main(String[] args) {
        int a = 10;
        Integer a2 = Integer.valueOf(a);
        System.out.println(a2);

        //auto bboxing(int ->Integer)
        Integer a3 = a;
    }
}
