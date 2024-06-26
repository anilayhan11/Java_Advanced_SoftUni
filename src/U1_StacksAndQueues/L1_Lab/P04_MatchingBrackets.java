package U1_StacksAndQueues.L1_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P04_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i <= expression.length() - 1; i++) {
            char current = expression.charAt(i);

            if ('(' == current) {
                stack.push(i);
            } else if (')' == current) {
                int startIndex = stack.pop();
                String match = expression.substring(startIndex, i + 1);
                System.out.println(match);
            }

        }
    }
}
