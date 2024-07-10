package ClassWork.july09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Sonal", "Toronto", 30);
        Student student2 = new Student(2, "Mike", "Missi", 28);
        Student student3 = new Student(3, "John", "Toronto", 22);

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        // finding student using name
        System.out.println("finding student with name Mike : ");
        for(Student st : list){
            if(st.getName().contains("Mike")){
                System.out.println(st);
            }
        }
        System.out.println();

        // finding student with age > 25
        System.out.println("Students with age > 25 : ");
        for(Student st : list){
            if(st.getAge() > 25){
                System.out.println(st);
            }
        }
    }
}
