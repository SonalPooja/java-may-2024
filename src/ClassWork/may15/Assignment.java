package ClassWork.may15;
public class Assignment {
    public static void main(String[] args){

        int x = 10;
        int sum = 2;
        int y = 2;

        //sum = sum + x;   // adding sum and x and storing this value in sum
        sum += x;       // assigning and adding value at same time
        y =+ x;

        System.out.println("Sum using += is : " + sum);
        System.out.println("Sum using =+ is : " + y);
    }
}
