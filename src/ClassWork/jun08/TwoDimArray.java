package ClassWork.jun08;

import java.util.Scanner;

public class TwoDimArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows in first array : ");
        int row1 = sc.nextInt();
        System.out.println("Enter number of columns in first array : ");
        int col1 = sc.nextInt();

        // two-dimensional array
        int[][] arr1 = new int[row1][col1];

        System.out.println("Enter elements : ");

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("First array is : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Enter number of rows in second array : ");
        int row2 = sc.nextInt();
        System.out.println("Enter number of columns in second array : ");
        int col2 = sc.nextInt();

        int[][] arr2 = new int[row2][col2];
        System.out.println("Enter elements : ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Second array is : ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        // adding two-dimensional array
        int rows = arr1.length;
        int col = arr1[0].length;

        int[][] result = new int[rows][col];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println();
        System.out.println("Sum of both arrays : ");
        System.out.println();

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
