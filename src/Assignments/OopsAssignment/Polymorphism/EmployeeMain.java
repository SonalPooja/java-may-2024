package Assignments.OopsAssignment.Polymorphism;

public class EmployeeMain {

    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101, "Sonal", 78000);
        System.out.println("Full-time employee details: ");
        fullTimeEmployee.displayDetails();
        System.out.println();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(102, "Pooja", 155, 25.5);
        System.out.println("Part-time employee details: ");
        partTimeEmployee.displayDetails();
    }
}
