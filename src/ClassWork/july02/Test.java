package ClassWork.july02;

import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        String s = "Prgara";
        String uppercase = s.toUpperCase();
        System.out.println(uppercase);

        String s1 = null;
        System.out.println(s1);
        uppercase = s1.toUpperCase(); // exception occur here because we are trying to perform operation on null
        System.out.println(uppercase);


    }
}
