package Assignments.Strings;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        // traverse through length of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // to check if it is a letter
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        System.out.println("No. of Vowels : " + vowels);
        System.out.println("No. of Consonants : " + consonants);
    }
}
