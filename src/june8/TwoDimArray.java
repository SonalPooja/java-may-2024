package june8;

public class TwoDimArray {
    public static void main(String[] args) {

        // two-dimensional array
        int[][] arr1 = new int[3][3];

        arr1[0][0] = 10;
        arr1[0][1] = 20;
        arr1[0][2] = 30;
        arr1[1][0] = 40;
        arr1[1][1] = 50;
        arr1[1][2] = 60;
        arr1[2][0] = 70;
        arr1[2][1] = 80;
        arr1[2][2] = 90;

        int[][] arr2 = new int[3][3];

        arr2[0][0] = 100;
        arr2[0][1] = 200;
        arr2[0][2] = 300;
        arr2[1][0] = 400;
        arr2[1][1] = 500;
        arr2[1][2] = 600;
        arr2[2][0] = 700;
        arr2[2][1] = 800;
        arr2[2][2] = 900;

        // adding two-dimensional array
        int rows = arr1.length;
        int col = arr1[0].length;

        int[][] result = new int[rows][col];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

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
