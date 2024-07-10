package ClassWork.july06;

public class Student<T, R> {   // adding generic..T means any type of data

    T id;          // to work with any type of data
    R name;        // but have to pass type at compile time

    public Student(T id, R name) {
        this.id = id;
        this.name = name;
    }
}

//public class Student {
//
//    Object id;          // to work with any type of data
//    Object name;        // but we are compromising type safety
//
//    public Student(Object id, Object name) {
//        this.id = id;
//        this.name = name;
//    }
//}
