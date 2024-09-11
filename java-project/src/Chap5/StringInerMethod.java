package Chap5;

public class StringInerMethod {
    public static void main(String[] args) {
        String hj = "Hello Java";
        System.out.println(hj.indexOf("J"));

        String hj2= "Hello Java Java";
        String replacehj = hj2.replaceAll("Java","World");
        System.out.println(replacehj);

        String hj3 = "Hello Everyone Everyone";
        hj3.substring(8,13);
        System.out.println(hj3.substring(8));
    }
}
