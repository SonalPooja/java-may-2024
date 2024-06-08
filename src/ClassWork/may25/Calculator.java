package ClassWork.may25;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("Welcome to my calculator");
        System.out.println("*******************************");

        System.out.println("Enter first number : ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number : ");
        double num2 = sc.nextDouble();
        System.out.println();
        System.out.println("1. Press 1 for Addition");
        System.out.println("2. Press 2 for Subtraction");
        System.out.println("3. Press 3 for Multiplication");
        System.out.println("4. Press 4 for Division");
        System.out.println("5. Press 5 for Modulus");
        System.out.println("6. Exit");
        int input = sc.nextInt();
        double result;

        switch(input){
            case 1 :
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case 2 :
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " +result);
                break;
            case 3 :
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " +result);
                break;
            case 4 :
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " +result);
                break;
            case 5 :
                result = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " +result);
                break;
            case 6 :
                break;
            default:
                System.out.println("Choose a valid option..");
        }

    }
}
