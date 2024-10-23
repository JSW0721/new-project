package Chap10.Inherit;
//제네릭 클래스 상속 TEST

public class InheritGenericEx {
    public static void main(String[] args) {
        TV tv = new TV();
        ChildProduct<TV, String, String> CP = new ChildProduct<>(new TV(),"Galaxy TV","삼성");

        String company = CP.getCompany();
        System.out.println(company);
    }
}
