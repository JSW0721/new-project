package Chap10.NonGeneric;

public class BoxEx {
    public static void main(String[] args) {
        Box box = new Box();
        box.set("문자열");
        String str = (String)box.get();
        System.out.println(str);
    }
}
