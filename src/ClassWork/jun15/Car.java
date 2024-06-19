package ClassWork.jun15;

public class Car extends Vehicle{

    int numOfSeats;

    public void brake(){
        System.out.println("Car brake applied");
    }

    public void seats(int numOfSeats){
        System.out.println("Number of seats : " + numOfSeats);
    }

    public Car(String make, String model, String year, String color, String type, int numOfSeats) {
        super(make, model, year, color, type);
        this.numOfSeats = numOfSeats;
        seats(numOfSeats);
    }

}
