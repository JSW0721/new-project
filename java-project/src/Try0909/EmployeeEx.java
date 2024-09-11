package Try0909;

public class EmployeeEx {
    public static void main(String[] args) {
        FullTimeEmployee FTE = new FullTimeEmployee("Alice",5000);
        PartTimeEmployee PTE = new PartTimeEmployee("BOB", 1000,20);

        System.out.println(FTE.name + "'s Pay : "+FTE.calculateSalary());
        System.out.println(PTE.name + "'s Pay : "+PTE.calculateSalary());
    }
}
