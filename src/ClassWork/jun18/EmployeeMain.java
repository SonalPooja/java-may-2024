package ClassWork.jun18;

public class EmployeeMain {

    public static void main(String[] args) {

        Address address = new Address("110 Matheson Blvd", "Mississauga", "ON", "Canada", "L1K W3k");
        Employee emp1 = new Employee(101, "Sonal", 10000.00, "FSD", address);
        Employee emp2 = new Employee(102, "Navjot", 10020.00, "SD", new Address("110 Matheson Blvd", "Etobicoke", "ON", "Canada", "L1K W3k"));
        Employee emp3 = new Employee(103, "Ankush", 13000.00, "Dev", new Address("110 Matheson Blvd", "Brampton", "ON", "Canada", "L1K W3k"));
        Employee emp4 = new Employee(104, "Madhu", 10400.00, "FE", new Address("110 Matheson Blvd", "Mississauga", "ON", "Canada", "L1K W3k"));

        // to change city of emp1
        emp1.address.city = "Toronto";

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);

    }
}
