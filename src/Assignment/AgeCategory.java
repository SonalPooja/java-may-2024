package Assignment;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age : ");
        int age = sc.nextInt();
        String category;

        if(age >= 0 && age < 13){
            category = "Child";
        }
        else if (age >= 13 && age <=19) {
            category = "Teenager";
        }
        else if (age >= 20 && age <=59) {
            category = "Adult";
        }
        else if (age >= 60) {
            category = "Senior";
        }
        else {
            System.out.println("Enter a valid age.");
            category = "N/A";
        }
        System.out.println("Age : " + age);
        System.out.println("Category : " + category);
    }
}
