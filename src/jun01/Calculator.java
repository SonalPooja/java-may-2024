package jun01;

import java.util.Scanner;

public class Calculator {

    Scanner sc = new Scanner(System.in);

    double sum(){
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();
        double res = a + b;
        System.out.println(a + " + " + b + " = " + res);
        return res;
    }

    double subtract(){
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();
        double res = a - b;
        System.out.println(a + " - " + b + " = " + res);
        return res;
    }

    double multiply(){
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();
        double res = a * b;
        System.out.println(a + " * " + b + " = " + res);
        return res;
    }

    double divide(){
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();
        double res = a / b;
        System.out.println(a + " / " + b + " = " + res);
        return res;
    }

    double modulus(){
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();
        double res = a % b;
        System.out.println(a + " % " + b + " = " + res);
        return res;
    }
}

