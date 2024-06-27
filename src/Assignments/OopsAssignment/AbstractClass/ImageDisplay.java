package Assignments.OopsAssignment.AbstractClass;

public class ImageDisplay extends MediaDevice{

    private String imageName;
    private  String resolution;

    public ImageDisplay(String name, String imageName, String resolution) {
        super(name);
        this.imageName = imageName;
        this.resolution = resolution;
    }

    public void displayImage(){
        System.out.println("Displaying image of " + imageName + " having resolution " + resolution);
    }

    @Override
    public void displayDetails() {
        System.out.println("Image display: " + getName());
        System.out.println("Image name: " + imageName);
        System.out.println("Resolution: " + resolution);
    }
}
