package Assignments.Strings;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = scanner.nextLine();

        // splitting in words using space
        String[] words = sentence.split(" ");

        String reverse = "";
        // reversing the words order
        for (int i = words.length - 1; i >= 0; i--) {
            reverse += words[i] + " ";
        }

        System.out.println("Reversed sentence : " + reverse);

    }
}
