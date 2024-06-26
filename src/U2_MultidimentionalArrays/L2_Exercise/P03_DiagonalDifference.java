package U2_MultidimentionalArrays.L2_Exercise;

import java.util.Scanner;

public class P03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            String[] rowInput = scanner.nextLine().split(" ");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(rowInput[col]);
            }
        }

        int mainDiagonal = 0;

        for (int index = 0; index < size; index++) {
            mainDiagonal = mainDiagonal + matrix[index][index];
        }

        int secondaryDiagonal = 0;

//        **FOR loop with two variables**

//        for (int row = size - 1, col = 0; col < size && row >= 0; row--, col++) {
//            secondaryDiagonal = secondaryDiagonal + matrix[row][col];
//        }

        for (int row = 0; row < size; row++) {
            secondaryDiagonal = secondaryDiagonal + matrix[row][size - row - 1];
        }

        System.out.println(Math.abs(mainDiagonal - secondaryDiagonal));
    }
}
