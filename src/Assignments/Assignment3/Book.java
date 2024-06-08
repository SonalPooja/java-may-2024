package Assignments.Assignment3;

public class Book {

    //instance variables
    String title;
    String author;
    double price;
    int quantity;

    //constructor
    Book(String title, String author, double price, int quantity){
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    //static method to calculate total price
    public static double calculatePrice(Book book, int quantity){
        return book.price * quantity;
    }

    //method to print books
    public void showBooks(int serialNo){
        System.out.printf("%-5d %-25s %-25s $%-10.2f %-10d%n", serialNo, title, author, price, quantity);
    }

    //method to update stock quantity after purchase
    public int updateQuantity(int quantity){
        return this.quantity - quantity;
    }
}
