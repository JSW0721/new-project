package chap2;

public class Sample {
    public static void main(String[] args){
        // 참조자료형 : new 예약어를 사용해서 변수를 초기화
        // 단, String 만은 기본형 타입처럼 변수 선언 가능.
        String str = "실제값";
        String str2 = new String("실제값");
        String str3 = "실제값";
        String str4 = new String("실제값");

        System.out.println("str == str2 : " + (str == str2));//false
        System.out.println("str == str3 : " + (str == str3));//true
        System.out.println("str2 == str4 : " + (str2 == str4));//false
        //String만의 특징으로 인해 값을 비교할때도, 주소값을 비교할 때도 있음.
        System.out.println(str.equals(str2));
        System.out.println(str.equals(str3));

        int a = 10;
        int b= 10;
        System.out.println(a == b);//true - 값을 비교
    }
}
