package Assignments.Arrays;

public class SumOfTwoDimensionalArrays {
    public static void main(String[] args) {

        int[][] array1= {{54,12,4}, {2,36,40}, {6,4,5}};
        int[][] array2 = {{2,9,40}, {5,3,6}, {3,5,12}};

        int rows = array1.length;
        int col = array1[0].length;

        int[][] result = new int[rows][col];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
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
