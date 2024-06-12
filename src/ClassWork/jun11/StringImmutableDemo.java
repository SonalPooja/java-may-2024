package ClassWork.jun11;

public class StringImmutableDemo {

    public static void main(String[] args) {

        String s1 = "pragra";
        System.out.println(s1);

        String s2 = "pragra";
        System.out.println(s2);

        String s3 = "pragra";
        System.out.println(s3);

        // just change the reference of s3 to mouse
        s3 = "mouse";
        System.out.println(s3);
    }
}
