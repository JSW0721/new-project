package chap2.casting;

public class AutoCasting {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println(intValue);

        char charValue = '가';
        intValue = charValue;  //char의 int로의 자동 형변환
        System.out.println("'가'의 유니코드 : " + intValue);

        intValue = 500;
        long longValue = intValue;  //int(4byte)의 long(8byte)화(묵시적 형변환)
        System.out.println(longValue);

        intValue = 200;
        double doubleValue = intValue;  //int(4byte, 정수)의 double(8byte, 실수)화(묵시적 형변환)
        System.out.println(doubleValue);
    }
}
