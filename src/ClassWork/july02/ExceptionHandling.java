package ClassWork.july02;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[5];

        try {
            System.out.println("Enter " + intArray.length + " integers:");
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = scanner.nextInt();
            }

            System.out.println("Array:");
            for (int i = 0; i < intArray.length; i++) {
                System.out.println(intArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("Test finally block");
        }
    }
}
