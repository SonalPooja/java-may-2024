package jun04;

public class Student {

    int id; // instance variable
    String name;

    Student(){
        System.out.println("Inside default constructor");
    }

    Student(int id){
        this.id = id;
    }

    Student(int id, String name){  //local variable
        this();  // calling default constructor
        this.id = id;
        this.name = name;
    }

    public void printDetails(){
        System.out.println(id);
        System.out.println(name);
    }

}
