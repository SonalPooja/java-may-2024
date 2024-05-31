package may21;

import java.util.Scanner;

public class NumberIfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = sc.nextInt();
        boolean result = num >= 0;

        if(result) {
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is negative");
        }
    }
}
