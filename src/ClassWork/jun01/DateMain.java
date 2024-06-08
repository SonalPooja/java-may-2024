package ClassWork.jun01;

import java.util.Scanner;

public class DateMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // calling default constructor
        DateDemo dateDemo = new DateDemo();
        // calling parameterized constructor
        DateDemo dateDemo2 = new DateDemo(2, 5, 2024);
        dateDemo2.printDate();

        System.out.println("Enter day");
        dateDemo.day = sc.nextInt();
        System.out.println("Enter month");
        dateDemo.month = sc.nextInt();
        System.out.println("Enter year");
        dateDemo.year = sc.nextInt();
        System.out.println();

        dateDemo.printDate();

    }
}
