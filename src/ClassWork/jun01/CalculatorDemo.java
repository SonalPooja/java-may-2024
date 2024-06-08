package ClassWork.jun01;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("Welcome to my calculator");
        System.out.println("*******************************");
        System.out.println("1. Press 1 for Addition");
        System.out.println("2. Press 2 for Subtraction");
        System.out.println("3. Press 3 for Multiplication");
        System.out.println("4. Press 4 for Division");
        System.out.println("5. Press 5 for Modulus");
        System.out.println("6. Exit");
        int input = sc.nextInt();
        System.out.println();

        switch(input){
            case 1 :
                calculator.sum();
                break;
            case 2 :
                calculator.subtract();
                break;
            case 3 :
                calculator.multiply();
                break;
            case 4 :
                calculator.divide();
                break;
            case 5 :
                calculator.modulus();
                break;
            case 6 :
                break;
            default:
                System.out.println("Choose a valid option..");
        }
    }
}
