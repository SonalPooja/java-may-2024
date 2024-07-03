package Assignments.EnhancedStudentManagementSystem;

public class StudentManager {

    Student[] students;
    int studentCount;

    public StudentManager(int capacity) {
        this.students = new Student[capacity];
        this.studentCount = 0;
    }

    public void addStudent(Student student){
        if(studentCount < students.length){
            students[studentCount++] = student;
        }
        else
            System.out.println("Class full..Can not add any more students.");
    }

    public void displayAllStudents(){
        for (int i = 0; i < studentCount; i++) {
            students[i].displayInfo();
            System.out.println();
        }
    }

    public Student findStudentByRollNumber(int rollNumber){
        System.out.println("Searching student with roll no. : " + rollNumber);
        for (int i = 0; i < studentCount; i++) {
            if(students[i].getRollNumber() == rollNumber){
                return students[i];
            }
        }
        return null;
    }

    public void removeStudentByRollNumber(int rollNumber){
        for (int i = 0; i < studentCount; i++) {
            if(students[i].getRollNumber() == rollNumber){
                students[i] = students[--studentCount];
                students[studentCount] = null;
                System.out.println("Student with roll no. " + students[i-1].getRollNumber() + " removed.");
                System.out.println();
            }
        }
    }


    void displayTopStudent(){
        Student topStudent = students[0];
        double highestAverage = topStudent.calculateAverageGrade();

        for (int i = 1; i < studentCount; i++) {
            double currentAverage = students[i].calculateAverageGrade();
            if (currentAverage > highestAverage) {
                topStudent = students[i];
                highestAverage = currentAverage;
            }
        }
        System.out.println("Top Student:");
        topStudent.displayInfo();
    }
}
