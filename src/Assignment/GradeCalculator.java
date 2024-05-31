package Assignment;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args){

        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks : ");
        int marks = sc.nextInt();

        if(marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80 && marks<=89) {
            grade = 'B';
        } else if (marks >= 70 && marks<=79) {
            grade = 'C';
        } else if (marks >= 60 && marks<=69) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade : " + grade);
    }
}
