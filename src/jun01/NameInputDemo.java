package jun01;

import java.util.Scanner;

public class NameInputDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        NameInput nameInput = new NameInput();

        System.out.println("Enter name");
        String name = sc.next();
        System.out.println(nameInput.input(name));
        System.out.println();
        System.out.println("Enter email");
        String email = sc.next();
        System.out.println(nameInput.input(name, email));
        System.out.println();
        System.out.println("Enter password");
        String password = sc.next();
        System.out.println(nameInput.input(name, email, password));
    }
}
