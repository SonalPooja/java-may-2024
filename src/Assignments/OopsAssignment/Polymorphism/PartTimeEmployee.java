package Assignments.OopsAssignment.Polymorphism;

public class PartTimeEmployee extends Employee{

    private double hours;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double hours, double hourlyRate) {
        super(employeeId, name);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay(){
        return hours * hourlyRate;
    }
}
