package ClassWork.may21;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){

        // Scanner - user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int x = sc.nextInt();
        System.out.println("Enter the second number : ");
        int y = sc.nextInt();

        int sum = x + y;
        System.out.println("Sum of numbers " + x + " and " + y + " is : " + sum );

    }
}
