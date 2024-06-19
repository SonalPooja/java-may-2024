package ClassWork.jun15;

public class Sedan extends Car{

    public Sedan(String make, String model, String year, String color, String type, int numOfSeats) {
        super(make, model, year, color, type, numOfSeats);
    }

    public static void main(String[] args) {

        Sedan sedan = new Sedan("Honda", "CRV", "2024", "black", "SUV", 5);
        sedan.printCarDetails();
        sedan.brake();
    }
}
