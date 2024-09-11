package Chap5;

public class TEST0905 {
    public static void main(String[] args) {
        String str = "aaabbccd";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        String str2 = "Hello Welcome Java";
        String arr[] = str2.split(" ");
        String str3 = String.join(" ", arr);
        for (String s : arr) {
            str3 += s + " ";
        }
        str3 = str3.substring(0, str3.length() - 1);
        System.out.println(str3);

        String str4 = "Hello Welcome Java";
        String arr2[] = str4.split(" ");
        String str5 = String.join("", arr2);
        System.out.println(str5);
    }
}
