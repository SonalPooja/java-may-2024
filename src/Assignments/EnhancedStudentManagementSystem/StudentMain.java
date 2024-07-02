package Assignments.EnhancedStudentManagementSystem;

public class StudentMain {
    public static void main(String[] args) {

        double[] grades1 = {85.5, 90.0, 88.0};
        double[] grades2 = {78.0, 82.5, 80.0};
        double[] grades3 = {92.0, 95.5, 94.0};
        double[] grades4 = {90.0, 85.5, 74.0};

        //Creating instances of Student
        Student student1 = new Student("Sonal", 1, 20, "Computer Science", grades1);
        Student student2 = new Student("Pooja", 2, 22, "Mathematics", grades2);
        Student student3 = new Student("Muskan", 3, 25, "Accounting", grades3);
        Student student4 = new Student("Akash", 4, 28, "Engineering", grades4);

        StudentManager studentManager = new StudentManager(20);

        //Add students to the StudentManager
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);

        //Display all students
        studentManager.displayAllStudents();

        //Search for a specific student by roll number
        Student foundStudent = studentManager.findStudentByRollNumber(1);
        if (foundStudent != null) {
            foundStudent.displayInfo();
            System.out.println();
        }

        //Remove a student by roll number
        studentManager.removeStudentByRollNumber(2);

        //Display the top student with the highest average grade
        studentManager.displayTopStudent();

    }
}
