package Assignments.Assignment;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of first side: ");
        int side1 = sc.nextInt();
        System.out.println("Enter length of second side: ");
        int side2 = sc.nextInt();
        System.out.println("Enter length of third side: ");
        int side3 = sc.nextInt();

        String triangleType;

        if(side1 == side2 && side2 == side3){
            System.out.println("It is an Equilateral triangle");
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("It is an Isosceles triangle.");
        }
        else{
            System.out.println("It is a Scalene triangle ");
        }
    }
}
