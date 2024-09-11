package Chap7.Abstract;

public class EmployeeEx {
    public static void main(String[] args) {
        FullTimeEmployee FTE = new FullTimeEmployee("Alice",5000);
        PartTimeEmployee PTE = new PartTimeEmployee("BOB", 1000,20);

        System.out.println(FTE.getName() + "'s Pay : "+FTE.calculateSalary());
        System.out.println(PTE.getName() + "'s Pay : "+PTE.calculateSalary());

        //추상 클래스로 객체 생성 불가.
        //Employee employee = new Employee();

        //객체 지향 특징 - 다형성
        //Employee fulltime = new FullTimeEmployee("",45);
        //Employee partTimeemployee = new Employee();
    }

    void test(Employee employee){
        employee.calculateSalary();
    }
    void test(FullTimeEmployee emp){

    }
    void test(PartTimeEmployee emp){

    }
}
