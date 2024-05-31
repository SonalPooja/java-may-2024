package may15;
public class ComparisonOperator {
    public static void main(String[] args){
        // ==  <=  >=  !=  <  >

        int x = 10;
        int y = 20;
        int a = 15;
        int b = 25;
        //boolean result;

        //result = x == y;

        System.out.println(x + " is equal to " + y + " : " + (x==y));
        System.out.println(x + " is < " + y + " : " + (x<y));
        System.out.println(x + " is > " + y + " : " + (x>y));
        System.out.println(x + " is >= " + y + " : " + (x>=y));
        System.out.println(x + " is <= " + y + " : " + (x<=y));
        System.out.println(x + " is != " + y + " : " + (x!=y));
        System.out.println(a + " is > " + b + " : " + (a>b));
        System.out.println(a + " is < " + x + " : " + (a<x));
        System.out.println(b + " is == " + y + " : " + (b==y));
        System.out.println(a + " is >= " + y + " : " + (a>=y));
        System.out.println(b + " is <= " + y + " : " + (b<=y));
        System.out.println(b + " is != " + y + " : " + (b!=y));

    }
}
