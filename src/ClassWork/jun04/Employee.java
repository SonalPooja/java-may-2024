package ClassWork.jun04;

public class Employee {
    int id;
    String name;
   static String company = "Pragra"; // memory is assigned only once

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void printDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(company);
    }
}

class EmpMain{
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Muskan");
        Employee e2 = new Employee(102, "Sonal");
        Employee e3 = new Employee(103, "Pooja");
        Employee e4 = new Employee(104, "Vivek");
        e1.printDetails();
        e2.printDetails();
        e3.printDetails();
        e4.printDetails();
    }
}
