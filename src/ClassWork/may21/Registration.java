package ClassWork.may21;
import java.util.Scanner;

public class Registration {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name : ");
        String firstName = sc.nextLine();
        System.out.println("Enter last name : ");
        String lastName = sc.nextLine();
        System.out.println("Enter email : ");
        String email = sc.nextLine();
        System.out.println("Enter phone number : ");
        String phone  = sc.nextLine();
        System.out.println("Enter address : ");
        String address = sc.nextLine();
        System.out.println("Enter salary : ");
        double salary = sc.nextDouble();

        System.out.println();
        System.out.println("User registered successfully with the following details: ");
        System.out.println("First name : " + firstName);
        System.out.println("Last name : " + lastName);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);
        System.out.println("Address : " + address);
        System.out.println("Salary : $" + salary);

    }
}
