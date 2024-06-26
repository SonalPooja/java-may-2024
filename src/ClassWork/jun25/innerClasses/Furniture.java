package ClassWork.jun25.innerClasses;

public interface Furniture {
    void seating();
}
//class Table implements Furniture {
//    @Override
//    public void seating() {
//        System.out.println("Comfortable seating...");
//    }
//}

//Anonymous inner class
class MainDemo{
    public static void main(String[] args) {

        Furniture furniture = new Furniture() {
            @Override
            public void seating() {
                System.out.println("Comfortable seating...");
            }
        };
    }
}