package ClassWork.jun01;

public class DateDemo {

    int day;
    int month;
    int year;

    public void printDate(){
        System.out.println(day + " / " + month + " / " + year);
    }
    // constructor
    DateDemo(){
        day = 0;
        month = 0;
        year = 0;
    }

    DateDemo(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
