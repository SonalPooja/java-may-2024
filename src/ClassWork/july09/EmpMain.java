package ClassWork.july09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpMain {
    public static void main(String[] args) {

        EmployeeList employee1 = new EmployeeList(1, "Sonal", "Pooja", "sonal@gmail.com", "Toronto", 20);
        EmployeeList employee2 = new EmployeeList(2, "Muskan", "Ahlawat", "ma@gmail.com", "Mississauga", 25);
        EmployeeList employee3 = new EmployeeList(3, "John", "Doe", "jd@gmail.com", "Toronto", 28);

        List<EmployeeList> list = new ArrayList<>();

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        Iterator<EmployeeList> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        // finding employee using city
        System.out.println("finding employee using city toronto : ");
        for(EmployeeList emp : list){
            if(emp.getCity().equals("Toronto")){
                System.out.println(emp);
            }
        }
        System.out.println();

        // finding employee with age > 20
        System.out.println("Employees with age > 20 : ");
        for(EmployeeList emp : list){
            if(emp.getAge() > 20){
                System.out.println(emp);
            }
        }
    }
}
