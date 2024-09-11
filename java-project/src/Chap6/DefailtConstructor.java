package Chap6;
//디폴트 생성자 확린해 보기
//->만약 클래스에 생성자가 하나도 없다면 컴파일러는 자동으로 디폴트 생성자를 추가
//-> 사용자가 작성한 생성자가 하나라도 구현되어 있다면 컴파일러는 다른 생성자를 추가하지 않음.

public class DefailtConstructor {
    String field;

    DefailtConstructor() {
        field = "초기화";
    }
    DefailtConstructor(String field) {
        this.field = field;
    }
    public static void main(String[] args) {
        //매개변수가 없는 생성자
        DefailtConstructor constructorTest1 = new DefailtConstructor();
        DefailtConstructor constructorTest2 = new DefailtConstructor("특정값2");
        System.out.println(constructorTest1.field);
        System.out.println(constructorTest2.field);
    }
}
