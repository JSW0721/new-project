package Chap7.Abstract;
//Employee의 추상화 연습
//CalculateSalary의 추상 메소드화
public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract double calculateSalary();
}
