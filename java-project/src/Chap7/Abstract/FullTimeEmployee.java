package Chap7.Abstract;

public class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    //메소드의 재정의(Override)
    @Override
    double calculateSalary() {
        return salary;
    }
}
