package U2_MultidimentionalArrays.L1_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P02_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        //Declare a 2D array
        int[][] matrix = new int[rows][cols];

        //Iterate over each row
        for (int r = 0; r < rows; r++) {

            //Read an array for each row
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            //Fill in each array (column) on each row with values.
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = arr[c];
            }
        }

        boolean isFound = false;

        int specialValue = Integer.parseInt(scanner.nextLine());

        // Iterate over each row and column in the matrix to find the special value
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int currentElement = matrix[row][col];

                if (currentElement == specialValue) {
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }

        if (!isFound) {
            System.out.println("not found");
        }
    }
}
