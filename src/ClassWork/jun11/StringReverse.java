package ClassWork.jun11;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        String s1 = "pragra";
        System.out.println("String : " + s1);

        System.out.print("Reverse : ");

        // using character array
        char[] ch = s1.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }

//        // reverse the string
//        String reverse = "";
//        for (int i = s1.length() - 1; i >= 0 ; i--) {
//            reverse = reverse + s1.charAt(i);
//        }
//
//        System.out.print("Reverse string : " + reverse);

    }
}
