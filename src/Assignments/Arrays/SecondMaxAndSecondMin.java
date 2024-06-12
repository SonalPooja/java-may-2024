package Assignments.Arrays;

import java.util.Arrays;

public class SecondMaxAndSecondMin {
    public static void main(String[] args) {

        int[] arr = {10,30,43,54,23,543,43,32};

        // second maximum element -> sorting array in ascending order
        Arrays.sort(arr);
        int secondMax = arr[arr.length-2];
        System.out.println("Second max element : " + secondMax);

        Arrays.sort(arr);
        int secondMin = arr[1];
        System.out.println("Second min element : " + secondMin);
    }
}
