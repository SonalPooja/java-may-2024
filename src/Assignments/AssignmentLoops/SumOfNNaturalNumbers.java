package Assignments.AssignmentLoops;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {

        int num = 1;
        int input;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        input = sc.nextInt();

        do{
            sum += num;
            num++;
        }while (num <= input);

        System.out.println("Sum of first " + input + " numbers is : " + sum);
    }
}
