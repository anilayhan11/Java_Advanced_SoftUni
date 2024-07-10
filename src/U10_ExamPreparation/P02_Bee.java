package U10_ExamPreparation;

import java.util.Scanner;

public class P02_Bee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];

        fillMatrix(matrix, scanner);

        int beeRow = -1;
        int beeCol = -1;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (matrix[row][col].equals("B")) {
                    beeRow = row;
                    beeCol = col;
                }
            }
        }

        int pollinatedFlowers = 0;

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            matrix[beeRow][beeCol] = ".";

            if (command.equals("right") && beeCol < size - 1) {
                beeCol++;
                if (matrix[beeRow][beeCol].equals("O") && beeCol < size - 1) {
                    matrix[beeRow][beeCol] = ".";
                    beeCol++;
                }
            } else if (command.equals("left") && beeCol > 0) {
                beeCol--;
                if (matrix[beeRow][beeCol].equals("O") && beeCol > 0) {
                    matrix[beeRow][beeCol] = ".";
                    beeCol--;
                }
            } else if (command.equals("down") && beeRow < size - 1) {
                beeRow++;
                if (matrix[beeRow][beeCol].equals("O") && beeCol < size - 1) {
                    matrix[beeRow][beeCol] = ".";
                    beeRow++;
                }
            } else if (command.equals("up") && beeRow > 0) {
                beeRow--;
                if (matrix[beeRow][beeCol].equals("O") && beeCol > 0) {
                    matrix[beeRow][beeCol] = ".";
                    beeRow--;
                }
            } else {
                matrix[beeRow][beeCol] = ".";
                System.out.println("The bee got lost!");
                break;
            }


            if (matrix[beeRow][beeCol].equals("f")) {
                pollinatedFlowers++;
            }

            matrix[beeRow][beeCol] = "B";

            command = scanner.nextLine();
        }

        if (pollinatedFlowers >= 5) {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!\n", pollinatedFlowers);
        } else {
            int neededFlowers = 5 - pollinatedFlowers;
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more\n", neededFlowers);
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }

    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");
        }
    }
}
