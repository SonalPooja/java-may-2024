package may25;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a country from Canada, India or Australia :  ");
        String country = sc.next();
        // switch takes some type of data
        switch(country){
            case  "Canada":
                System.out.println("Capital of " + country + " is Ottawa");
                break;
            case "India" :
                System.out.println("Capital of " + country + " is New Delhi");
                break;
            case  "Australia" :
                System.out.println("Capital of " + country + " is Canberra");
                break;
            default:
                System.out.println("Choose from the given list of countries.");
        }
    }
}
