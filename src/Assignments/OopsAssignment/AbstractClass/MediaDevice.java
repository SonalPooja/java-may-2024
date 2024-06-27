package Assignments.OopsAssignment.AbstractClass;

public abstract class MediaDevice {

    private String name;

    public abstract void displayDetails();

    public MediaDevice(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
