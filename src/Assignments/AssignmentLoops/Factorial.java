package Assignments.AssignmentLoops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int factorial = 1;
        int counter = 1;

        while(counter <= num){
            factorial = factorial * counter;
            counter++;
        }

        System.out.println("Factorial of " + num + " is : " + factorial);
    }
}
