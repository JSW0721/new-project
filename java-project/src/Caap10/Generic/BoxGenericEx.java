package Caap10.Generic;

public class BoxGenericEx {
    public static void main(String[] args) {
        Box<String> box2 = new Box<>();
        box2.set("문자열");
        String str = box2.get();
        System.out.println(str);

        Box<Integer> intBox = new Box<>();
        Box<Double> doubleBox = new Box<>();
        Box<Float> floatBox = new Box<>();
        Box<Boolean> booleanBox = new Box<>();
    }
}
