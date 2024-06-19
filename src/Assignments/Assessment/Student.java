package Assignments.Assessment;

import java.util.Arrays;

public class Student {

    String name;
    int[] grades;
    int avgGrade;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public int getAverageGrade(){
        for (int grade : grades) {
            avgGrade += grade;
        }
        return avgGrade /grades.length;
    }

    @Override
    public String toString() {
        return "Name : " + name +
                ", Grades = " + Arrays.toString(grades);
    }
}
