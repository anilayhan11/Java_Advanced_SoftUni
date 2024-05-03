package U2_MultidimentionalArrays.L1_Lab;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class P05_MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int[][] maxSubmatrix = new int[2][2];

        int finalSum = Integer.MIN_VALUE;

        //1. Iterate over matrix (except the last row and column)
        for (int r = 0; r < matrix.length - 1; r++) {
            for (int c = 0; c < matrix[r].length - 1; c++) {

                //2. For each current element, deduce the submatrix coordinates
                int currentElement = matrix[r][c];
                int right = matrix[r][c + 1];
                int below = matrix[r + 1][c];
                int diagonal = matrix[r + 1][c + 1];

                //3. Check the sum of the current 2x2 matrix
                int sum = currentElement + right + below + diagonal;

                //4. Check if the sum of the current 2x2 matrix is the biggest
                // If so, fill in the submatrix with the corresponding values.
                if (finalSum < sum) {
                    finalSum = sum;

                    maxSubmatrix[0][0] = currentElement;
                    maxSubmatrix[0][1] = right;
                    maxSubmatrix[1][0] = below;
                    maxSubmatrix[1][1] = diagonal;
                }
            }
        }
        System.out.println(maxSubmatrix[0][0] + " " + maxSubmatrix[0][1]);
        System.out.println(maxSubmatrix[1][0] + " " + maxSubmatrix[1][1]);
        System.out.println(finalSum);
    }
}
