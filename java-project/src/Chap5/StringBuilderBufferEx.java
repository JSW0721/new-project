package Chap5;

public class StringBuilderBufferEx {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append("Java");
        buffer.append("World");
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder();
        System.out.println(builder.insert(builder.length(),"오십번째"));

        //substring
        String substringResult = buffer.substring(6);
        String substringResult2 = buffer.substring(6,7);

        System.out.println(substringResult);
        System.out.println(substringResult2);
    }
}
