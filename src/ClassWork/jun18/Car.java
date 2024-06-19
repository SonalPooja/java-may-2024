package ClassWork.jun18;

public class Car {

    String make;
    String model;
    MusicPlayer mp;

    public Car(String make, String model, MusicPlayer mp) {
        this.make = make;
        this.model = model;
        this.mp = mp;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mp=" + mp +
                '}';
    }
}
