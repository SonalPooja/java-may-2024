package Assignments.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,30,43,54,23,543,43,32};

        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i - 1] = temp;
        }
        for (int element : arr){
            System.out.println(element);
        }

//        int[] reverseArr = new int[arr.length];
//        int lastIndex = arr.length;
//        for (int i = 0; i < lastIndex; i++) {
//            reverseArr[i] = arr[lastIndex - i -1];
//        }
//
//        for (int element : reverseArr){
//            System.out.println(element);
//        }
    }
}
