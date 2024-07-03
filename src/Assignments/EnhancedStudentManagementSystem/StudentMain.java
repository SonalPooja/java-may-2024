package Assignments.EnhancedStudentManagementSystem;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentManager manager = new StudentManager(20);

        boolean exit = false;

        while (!exit) {
            System.out.println("-----------------------------------------");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Remove Student by Roll Number");
            System.out.println("5. Display Top Student");
            System.out.println("6. Exit");
            System.out.println("-----------------------------------------");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter course: ");
                    String course = scanner.nextLine();
                    System.out.print("Enter number of grades: ");
                    int numGrades = scanner.nextInt();
                    double[] grades = new double[numGrades];
                    for (int i = 0; i < numGrades; i++) {
                        System.out.print("Enter grade " + (i + 1) + ": ");
                        grades[i] = scanner.nextDouble();
                    }

                    Student student = new Student(name, rollNumber, age, course, grades);
                    manager.addStudent(student);
                    break;

                case 2:
                    System.out.println();
                    System.out.println("All Students:");
                    System.out.println();
                    manager.displayAllStudents();
                    break;

                case 3:
                    System.out.println();
                    System.out.print("Enter roll number to search: ");
                    int searchRollNumber = scanner.nextInt();
                    System.out.println();
                    Student foundStudent = manager.findStudentByRollNumber(searchRollNumber);
                    if (foundStudent != null) {
                        foundStudent.displayInfo();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println();
                    System.out.print("Enter roll number to remove: ");
                    int removeRollNumber = scanner.nextInt();
                    manager.removeStudentByRollNumber(removeRollNumber);
                    break;

                case 5:
                    System.out.println();
                    manager.displayTopStudent();
                    System.out.println();
                    break;

                case 6:
                    exit = true;
                    break;

                default:
                    System.out.println("Choose a valid option.");
            }
        }
    }
}
