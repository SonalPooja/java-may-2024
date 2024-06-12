package Assignments.Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.next();

        boolean isPalindrome = true;

        // traverse through half string
        for (int i = 0; i < str.length() / 2; i++) {
            // compare values at both ends
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                isPalindrome = false;
            }
        }

        if(isPalindrome){
            System.out.println("String : " + str + " is a palindrome.");
        }
        else{
            System.out.println("String : " + str + " is not a palindrome.");
        }
    }
}
