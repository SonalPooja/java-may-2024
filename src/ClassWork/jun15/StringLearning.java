package ClassWork.jun15;

import java.util.Arrays;

public class StringLearning {

    public static void main(String[] args) {

        String st = new String("Hello World");

        StringBuffer st1 = new StringBuffer("Hello World");
        StringBuffer st2 = new StringBuffer("Hello World");

        st.concat("!");
        System.out.println(st);

        st1.append("!");
        System.out.println(st1);

        st2.append(true);
        System.out.println(st2);

        st1.append(" This is java");
        System.out.println(st1);

        st1.insert(6, "java ");
        System.out.println(st1);

        st2.insert(st2.length(), "Welcome !");
        System.out.println(st2);

        String str = "This is java class";
        //StringBuffer buffer = new StringBuffer(str);
        //System.out.println(buffer.reverse());
        String[] splits = str.split(" "); // split the string based on white space
        String[] reverse = new String[splits.length];
        for (int i = 0; i < splits.length; i++) {
            reverse[i] = splits[splits.length-1-i];
        }

        for(String element : reverse){
            System.out.print(element + " ");
        }

    }
}
