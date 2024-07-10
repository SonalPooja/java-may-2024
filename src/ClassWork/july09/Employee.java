package ClassWork.july09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(0,1001);
        list.add(6,1002);

        System.out.println("List 1 size : " + list.size());

        // to set a specific index - it won't move while insertion
        list.set(0, 255);

        System.out.println(list);

        List<Integer> list2 = new ArrayList<>(list);
        list2.add(100);
        list2.add(200);
        System.out.println(list2);

        System.out.println("List 2 size : " + list2.size());

        System.out.println("Using for loop : ");
        //traversing through list using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Using for each loop : ");
        // for each
        for(Integer i : list2){
            System.out.println(i);
        }

        System.out.println("Using iterator : ");
        // iterator - first create object of iterator
        Iterator iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
