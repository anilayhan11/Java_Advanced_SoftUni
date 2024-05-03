package U2_MultidimentionalArrays.L1_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04_SumMatrixelements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        int totalSum = 0;

        for (int r = 0; r < rows; r++) {
            int sum = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .sum();

            totalSum += sum;
        }

        System.out.printf("%d\n%d\n%d\n", rows, cols, totalSum);
    }
}
