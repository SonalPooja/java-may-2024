package ClassWork.may21;
import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args){
        int ticketPrice;
        String day;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day : ");
        day = sc.next().toLowerCase();

        if (day.equals("saturday")){
            ticketPrice = 15;
        } else if (day.equals("sunday")) {
            ticketPrice = 12;
        } else {
            ticketPrice = 10;
        }

        System.out.println("Ticket price for " + day + " is : $" + ticketPrice);
    }
}
