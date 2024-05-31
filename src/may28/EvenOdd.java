package may28;

public class EvenOdd {
    public static void main(String[] args) {

        for(int i = 1; i <= 100 ; i++){
            if(i > 20 && i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
