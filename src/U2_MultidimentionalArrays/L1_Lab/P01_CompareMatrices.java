package U2_MultidimentionalArrays.L1_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P01_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        //Check if rows are equal
        boolean areEqual = firstMatrix.length == secondMatrix.length;

        for (int r = 0; r < firstMatrix.length; r++) {
            if (areEqual) {
                int[] firstArr = firstMatrix[r];
                int[] secondArr = secondMatrix[r];

                //Check if columns are equal
                areEqual = firstArr.length == secondArr.length;

                if (areEqual) {
                    for (int c = 0; c < firstArr.length; c++) {
                        if (firstArr[c] != secondArr[c]) {
                            areEqual = false;
                        }
                    }
                }
            }
        }

        String output;
        if (areEqual) {
            output = "equal";
        } else {
            output = "not equal";
        }

        System.out.println(output);
    }


    private static int[][] readMatrix(Scanner scanner) {

        int[] matrixSize = readArray(scanner);

        int rows = matrixSize[0];
        int cols = matrixSize[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] arr = readArray(scanner);

            matrix[i] = arr;
        }

        return matrix;
    }


    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
