package Try0909;

public class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
    double calculateSalary;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
