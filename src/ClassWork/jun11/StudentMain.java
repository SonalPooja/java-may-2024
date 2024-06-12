package ClassWork.jun11;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student(101, "Sonal");
        System.out.println(student); // prints reference instead of value

        student.printStudent();

        System.out.println("Using toString()");
        System.out.println(student.toString());
    }
}
