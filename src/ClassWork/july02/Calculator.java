package ClassWork.july02;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int x = sc.nextInt();

        System.out.println("Enter second number : ");
        int y = sc.nextInt();

        int div = 0;

        try {

            div = x / y;

        }catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("Div. of two nos. : " + div);
    }
}
