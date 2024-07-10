package ClassWork.july06.collection;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public static void main(String[] args) {

        //ArrayList<Integer> arrayList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // add at index 10
        list.add(4, 50);
        //printing list
        System.out.println(list);
        // printing size of list
        System.out.println(list.size());
        // removing from list
        list.remove(2);
        //printing list after removing
        System.out.println(list);
    }
}
