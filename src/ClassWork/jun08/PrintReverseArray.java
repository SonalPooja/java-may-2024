package ClassWork.jun08;

public class PrintReverseArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Array : ");

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println();
        System.out.println("Reverse Array :");

        // reverse of an array
        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}
