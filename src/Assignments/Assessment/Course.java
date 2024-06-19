package Assignments.Assessment;

public class Course {

    static Student[] students = new Student[100];
    static int studentCount = 0;

    public static void addStudent(Student student){
       students[studentCount] = student;
       studentCount++;
    }

    public static int getHighestGrade(){
        int highestGrade = 0;
        for (int i = 0; i < studentCount; i++) {
            for (int grade : students[i].grades) {
                if (grade > highestGrade) {
                    highestGrade = grade;
                }
            }
        }
        return highestGrade;
    }

    public static int getLowestGrade(){
        int lowestGrade = 100;
        for (int i = 0; i < studentCount; i++) {
            for (int grade : students[i].grades) {
                if (grade < lowestGrade) {
                    lowestGrade = grade;
                }
            }
        }
        return lowestGrade;
    }

    public static void printStudentDetails(){
        System.out.println("Total number of students : " + studentCount);
        System.out.println("----------------------------------");
        System.out.println("Student details : ");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
        System.out.println("----------------------------------");
        System.out.println("Highest Grade in class : " + Course.getHighestGrade());
        System.out.println("----------------------------------");
        System.out.println("Lowest Grade in class : " + Course.getLowestGrade());
        System.out.println("----------------------------------");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].name + " : Average Grade = " + students[i].getAverageGrade());
        }
        System.out.println("----------------------------------");

    }
}
