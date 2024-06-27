package Assignments.OopsAssignment.Polymorphism;

public class FullTimeEmployee extends Employee{

    private double annualSalary;

    public FullTimeEmployee(int employeeId, String name, double annualSalary) {
        super(employeeId, name);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculatePay(){
        return annualSalary / 12;
    }
}
