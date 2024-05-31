package Assignment;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any letter : ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is a Vowel.");
        }
        else {
            System.out.println(ch + " is a Consonant.");
        }
    }
}
