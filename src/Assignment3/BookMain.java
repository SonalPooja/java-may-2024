package Assignment3;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book book1 = new Book("A Tale of Two Cities", "Charles Dickens", 100.00, 120);
        Book book2 = new Book("The Alchemist ", "Paulo Coelho", 75.00, 419);
        Book book3 = new Book("And Then There Were None", "Agatha Christie", 120.50, 320);
        Book book4 = new Book("The Hobbit", "J.R.R. Tolkien", 99.00, 345);
        Book book5 = new Book("The Little Prince", "Antoine de Saint-Exupéry", 127.00, 222);

        System.out.println("Books available in stock :- ");
        System.out.println("*********************************************************************************");
        System.out.printf("%-5s %-25s %-25s %-10s %-10s%n", "S.No." , "Title", "Author", "Price", "Quantity");
        System.out.println("*********************************************************************************");
        System.out.println();
        book1.showBooks(1);
        book2.showBooks(2);
        book3.showBooks(3);
        book4.showBooks(4);
        book5.showBooks(5);
        System.out.println("*********************************************************************************");
        System.out.println();
        System.out.println("Enter the number of book you want :");
        int bookNumber = sc.nextInt();
        System.out.println("Enter quantity");
        int purchaseQuantity = sc.nextInt();
        String choice;

        switch(bookNumber){
            case 1:
                System.out.println(purchaseQuantity + " copies of book " + "'" + book1.title + "'" + " will cost : $" + Book.calculatePrice(book1, purchaseQuantity));
                System.out.println();
                System.out.println("Do you want to proceed with the purchase : yes/no");
                choice = sc.next();
                if(choice.equals("yes")){
                    System.out.println("Transaction completed!");
                    System.out.println();
                    System.out.println("Remaining copies of " + "'" + book1.title + "'" + " are : " + book1.updateQuantity(purchaseQuantity));
                }
                else if (choice.equals("no")) {
                    System.out.println("Transaction cancelled!!!");
                }
                else {
                    System.out.println("Enter a valid choice..");
                }
                break;
            case 2:
                System.out.println(purchaseQuantity + " copies of book " + "'" + book2.title + "'" + " will cost : $" + Book.calculatePrice(book2, purchaseQuantity));
                System.out.println();
                System.out.println("Do you want to proceed with the purchase : yes/no");
                choice = sc.next();
                if(choice.equals("yes")){
                    System.out.println("Transaction completed!");
                    System.out.println();
                    System.out.println("Remaining copies of " + "'" + book2.title + "'" + " are : " + book2.updateQuantity(purchaseQuantity));
                }
                else if (choice.equals("no")) {
                    System.out.println("Transaction cancelled!!!");
                }
                else {
                    System.out.println("Enter a valid choice..");
                }
                break;
            case 3:
                System.out.println(purchaseQuantity + " copies of book " + "'" + book3.title + "'" + " will cost : $" + Book.calculatePrice(book3, purchaseQuantity));
                System.out.println();
                System.out.println("Do you want to proceed with the purchase : yes/no");
                choice = sc.next();
                if(choice.equals("yes")){
                    System.out.println("Transaction completed!");
                    System.out.println();
                    System.out.println("Remaining copies of " + "'" + book3.title + "'" + " are : " + book3.updateQuantity(purchaseQuantity));
                }
                else if (choice.equals("no")) {
                    System.out.println("Transaction cancelled!!!");
                }
                else {
                    System.out.println("Enter a valid choice..");
                }
                break;
            case 4:
                System.out.println(purchaseQuantity + " copies of book " + "'" + book4.title + "'" + " will cost : $" + Book.calculatePrice(book4, purchaseQuantity));
                System.out.println();
                System.out.println("Do you want to proceed with the purchase : yes / no");
                choice = sc.next();
                if(choice.equals("yes")){
                    System.out.println("Transaction completed!");
                    System.out.println();
                    System.out.println("Remaining copies of " + "'" + book4.title + "'" + " are : " + book4.updateQuantity(purchaseQuantity));
                }
                else if (choice.equals("no")) {
                    System.out.println("Transaction cancelled!!!");
                }
                else {
                    System.out.println("Enter a valid choice..");
                }
                break;
            case 5:
                System.out.println(purchaseQuantity + " copies of book " + "'" + book5.title + "'" + " will cost : $" + Book.calculatePrice(book5, purchaseQuantity));
                System.out.println();
                System.out.println("Do you want to proceed with the purchase : yes/no");
                choice = sc.next();
                if(choice.equals("yes")){
                    System.out.println("Transaction completed!");
                    System.out.println();
                    System.out.println("Remaining copies of " + "'" + book5.title + "'" + " are : " + book5.updateQuantity(purchaseQuantity));
                }
                else if (choice.equals("no")) {
                    System.out.println("Transaction cancelled!!!");
                }
                else {
                    System.out.println("Enter a valid choice..");
                }
                break;
            default:
                System.out.println("Enter a valid number!");
        }
    }
}
