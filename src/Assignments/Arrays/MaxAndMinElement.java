package Assignments.Arrays;

public class MaxAndMinElement {
    public static void main(String[] args) {

        int[] arr = {10,30,43,54,23,543,43,32};

        // maximum element
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element : " + max);

        // minimum element
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element : " + min);
    }
}
