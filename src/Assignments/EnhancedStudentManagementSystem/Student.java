package Assignments.EnhancedStudentManagementSystem;

public class Student {


    String name;
    int rollNumber;
    int age;
    String course;
    double[] grades;

    public Student(String name, int rollNumber, int age, String course, double[] grades) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double calculateAverageGrade(){
        double totalGrade = 0;

        for(double grade : grades){
            totalGrade += grade;
        }

        return totalGrade / grades.length;
    }

    public void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Roll no. : " + rollNumber);
        System.out.println("Age : " + age + " years");
        System.out.println("Course : " + course);
        System.out.print("Grades : ");
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
        System.out.println("Average Grade: " + calculateAverageGrade());
    }
}
