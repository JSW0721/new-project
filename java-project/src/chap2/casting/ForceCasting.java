package chap2.casting;

public class ForceCasting {
    public static void main(String[]args){
        //long -> int
        long longValue2 = 3000;
        int intValue2 = (int)longValue2;
        System.out.println(intValue2);

        //double -> int
        double pi = 3.141592;
        int convertedpi = (int)pi;
        System.out.println(convertedpi);

        int intvalue = 10;
        char charvalue = 'a';
        double doublevalue = 3.141592;
        String stringvalue = "a";

        double doublevalue2 = (double)intvalue;

        char changeValue = stringvalue.charAt(0);
        System.out.println(changeValue);
    }
}
