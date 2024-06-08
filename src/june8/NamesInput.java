package june8;

import java.util.Scanner;

public class NamesInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        // names array
        String[] names = new String[n];
        System.out.println("Enter names : ");

        // taking user input and storing in an array
        for(int i = 0; i < names.length; i++){
            names[i] = sc.next();
        }

        System.out.println();
        System.out.println("The following are the " + n + " names you entered :");

        // printing array
        // for each loop
        for(String element : names){
            System.out.println(element);
        }

        //        for(int i =0; i < names.length; i++){
        //            System.out.println(names[i]);
        //        }
    }
}
