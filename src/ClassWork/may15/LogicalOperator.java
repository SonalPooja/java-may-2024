package ClassWork.may15;
public class LogicalOperator {

    public static void main(String[] args){

        int x = 30;
        int y = 20;
        int a = 15;
        int b = 25;

        //boolean result = (x>y) && (x>a);  //both conditions true, then only result is true
        //boolean result = (x<y) || (x>a);  //either of the condition true, result is true
        boolean result = !((x<y) || (x>a));  // result is opposite
        System.out.println(result);

    }
}
