package U2_MultidimentionalArrays.L1_Lab;

import java.util.Scanner;

public class P03_IntersectionOfTwoMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][];
        char[][] secondMatrix = new char[rows][];

        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            firstMatrix[row] = line.toCharArray();
        }
        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            secondMatrix[row] = line.toCharArray();
        }

        for (int r = 0; r < firstMatrix.length; r++) {
            for (int c = 0; c < firstMatrix[r].length; c++) {
                char outputSymbol = '*';

                if (firstMatrix[r][c] == secondMatrix[r][c]) {
                    outputSymbol = firstMatrix[r][c];
                }

                System.out.print(outputSymbol);
            }
            System.out.println();
        }
    }
}
