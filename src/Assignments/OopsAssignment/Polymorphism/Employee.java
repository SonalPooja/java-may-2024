package Assignments.OopsAssignment.Polymorphism;

public class Employee {

    private int employeeId;
    private String name;

    public double calculatePay(){
        return 0;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Pay: $" + calculatePay());
    }

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
}
