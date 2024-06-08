package Assignments.Assignment;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        boolean result = num%2==0;

        if(result) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
