package Assignments.Strings;

import java.util.Scanner;

public class SubStringLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.nextLine().toLowerCase();

        int maxLength = 0;
        int length = str.length();
        int start = 0; // Start index of the current substring

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            // Find the index of the first occurrence of the current character
            int index = str.indexOf(currentChar, start);
            // If the index is between start and i, update start to index + 1
            if (index >= start && index < i) {
                start = index + 1;
            }
            // Update the maximum length if needed
            if(i - start + 1 > maxLength){
                maxLength = i - start + 1;
            }
        }
        System.out.println(maxLength);
    }
}
