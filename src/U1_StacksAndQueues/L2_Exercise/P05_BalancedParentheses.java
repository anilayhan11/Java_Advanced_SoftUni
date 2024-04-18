package U1_StacksAndQueues.L2_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P05_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("");

        String result = isBalanced(input) ? "YES" : "NO";
        System.out.println(result);
    }

    private static boolean isBalanced(String[] input) {

        Deque<String> openParentheses = new ArrayDeque<>();
        Deque<String> closedParentheses = new ArrayDeque<>();

        for (String brace : input) {

            String openBrace = "";
            switch (brace) {
                case ")":
                    if (openParentheses.isEmpty()) {
                        return false;
                    }

                    openBrace = openParentheses.pop();
                    if (!openBrace.equals("(")) {
                        return false;
                    }
                    break;
                case "}":
                    if (openParentheses.isEmpty()) {
                        return false;
                    }

                    openBrace = openParentheses.pop();
                    if (!openBrace.equals("{")) {
                        return false;
                    }
                    break;
                case "]":
                    if (openParentheses.isEmpty()) {
                        return false;
                    }

                    openBrace = openParentheses.pop();
                    if (!openBrace.equals("[")) {
                        return false;
                    }
                    break;
                default:
                    openParentheses.push(brace);
            }
        }

        return openParentheses.isEmpty();
    }
}
