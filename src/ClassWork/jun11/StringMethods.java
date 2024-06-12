package ClassWork.jun11;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String s1 = "Hello";

        // uppercase
        String upperCase = s1.toUpperCase();
        System.out.println(upperCase);

        // lowercase
        String lowerCase = s1.toLowerCase();
        System.out.println(lowerCase);

        // to convert to char array
        char[] chars = s1.toCharArray();
        System.out.println(chars);

        // charAt -> value at specific inde}
        char ch = s1.charAt(1);
        System.out.println(ch);

        // concat -> adds value to string
        String concat = s1.concat("Java");
        System.out.println(concat);

        // trim -> remove white spaces
        String s2 = "   Hello";
        String trim = s2.trim();
        System.out.println(trim);
    }
}
