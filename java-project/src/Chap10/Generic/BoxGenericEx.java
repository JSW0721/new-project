package Chap10.Generic;

public class BoxGenericEx {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("문자열");
        //        box.set(10);
        // 다른 타입값은 입력 불가(컴파일 오류 발생)
        String str = box.get();
        System.out.println(str);

        Box<Integer> intBox = new Box<>();
        Box<Double> doubleBox = new Box<>();
        Box<Float> floatBox = new Box<>();
        Box<Boolean> booleanBox = new Box<>();
    }
}
