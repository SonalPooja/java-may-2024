package Assignments.Assignment;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println();
        int counter = 1;
        int result;

        System.out.println("Multiplication table of " + num + " : ");

        while(counter <= 10){
            result = num * counter;
            System.out.println(num + " * " + counter + " = " + result);
            counter++;
        }
    }
}
