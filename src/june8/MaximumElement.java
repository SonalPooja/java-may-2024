package june8;

import java.util.Scanner;

public class MaximumElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements : ");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println();

        showArray(arr);
        System.out.println();
        System.out.println("The maximum element is : " +maxElement(arr));

    }

    public static void showArray(int[] arr){
        System.out.println("Array is : ");
        for (int element : arr){
            System.out.println(element);
        }
    }

    public static int maxElement(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
