package Assignments.OopsAssignment.Polymorphism;

import java.util.Scanner;

public class Employee {

    private int employeeId;
    private String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Pay: $" + calculatePay());
    }

    public double calculatePay(){
        return 0;
    }

    public static void userInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee Id:");
        int id = sc.nextInt();
        System.out.println("Enter employee name:");
        String name = sc.next();
        System.out.println("Choose employee type: full-time or part-time");
        String type = sc.next();

        if(type.equals("full-time")){
            System.out.println("Enter annual salary:");
            double salary = sc.nextDouble();

            FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(id, name, salary);
            System.out.println();
            System.out.println("Full-time employee details: ");
            fullTimeEmployee.displayDetails();
            System.out.println();
        }
        else if (type.equals("part-time")){
            System.out.println("Enter total number of hours worked:");
            double hours = sc.nextDouble();
            System.out.println("Enter hourly pay rate:");
            double hourlyRate = sc.nextDouble();

            PartTimeEmployee partTimeEmployee = new PartTimeEmployee(id, name, hours, hourlyRate);
            System.out.println();
            System.out.println("Part-time employee details: ");
            partTimeEmployee.displayDetails();
        }
        else {
            System.out.println("Enter a either full-time or part-time.");
        }
    }
}
