package chap2;

public class StringConverter {
    public static void main(String[] args) {
        //String -> 숫자
        String str = "123456";
        //String str2 = "123456abc";
        int primitiveStr = Integer.parseInt(str);
        //int primitiveStr2 = Integer.parseInt(str2);// 에러남. Exception ERROR

        //String -> long/Long
        long primitiveLong = Long.parseLong(str);
        Float primitiveFloat = Float.parseFloat(str);
        System.out.println(primitiveFloat);

        double primitiveDouble = Double.parseDouble(str);
        Double wrapperDouble = Double.valueOf(str);

        String str2 = "1234.012F";
        Float floatStr = Float.parseFloat(str2);
        System.out.println("floatStr = " + floatStr);

        int intvalue = 10;
        String s1 = intvalue + "";
        String s2 = Integer.toString(intvalue);
        String s3 = String.valueOf(intvalue);

        System.out.println(intvalue);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
