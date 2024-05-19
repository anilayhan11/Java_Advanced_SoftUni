package U2_MultidimentionalArrays.L2_Exercise;

import java.util.Scanner;

public class P05_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read size
        String[] matrixSize = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);

        //Create and fill in matrix
        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] rowFromConsole = scanner.nextLine().split(" ");

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = rowFromConsole[col];

            }
        }

        //Read command for change in the format: "swap row1 col1 row2 col2"
        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("END")) {
            boolean isValidCommand = true;

            if (input.length == 5) {
                String command = input[0];
                int row1 = Integer.parseInt(input[1]);
                int col1 = Integer.parseInt(input[2]);
                int row2 = Integer.parseInt(input[3]);
                int col2 = Integer.parseInt(input[4]);

                // Check if input is valid and perform the swap
                if (isValidIndexByRow(row1, rows) && isValidIndexByRow(row2, rows)
                        && isValidIndexByColumn(col1, cols) && isValidIndexByColumn(col2, cols)
                        && command.equals("swap")) {

                    String temp = matrix[row1][col1];
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = temp;

                    // Print the modified matrix
                    printMatrix(matrix);
                } else {

                    isValidCommand = false;
                }

            } else {
                isValidCommand = false;

            }

            if (!isValidCommand) {
                System.out.println("Invalid input!");
            }

            input = scanner.nextLine().split("\\s+");

        }
    }

    private static boolean isValidIndexByRow(int index, int row) {
        return (index >= 0 && index < row);
    }

    private static boolean isValidIndexByColumn(int index, int column) {
        return (index >= 0 && index < column);
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
