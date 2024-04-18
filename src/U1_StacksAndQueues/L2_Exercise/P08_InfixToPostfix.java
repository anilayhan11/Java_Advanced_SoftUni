package U1_StacksAndQueues.L2_Exercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P08_InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> tokensStack = new ArrayDeque<>();
        StringBuilder postfixTokens = new StringBuilder();

        String input = scanner.nextLine();
        String[] token = input.split("\\s+");

        for (int i = 0; i < token.length; i++) {
            String currentToken = token[i];

            if (isNumber(currentToken)) {
                postfixTokens.append(currentToken).append(" ");

            } else if (isSign(currentToken)) {
                if ("(".equals(currentToken)) { // If sign is an opening parenthesis, push it onto the stack
                    tokensStack.push(currentToken);
                } else if (")".equals(currentToken)) { // If it's a closing parenthesis
                    // Pop operators from the stack and append them to the postfix expression
                    // until reaching the corresponding opening parenthesis
                    while (!"(".equals(tokensStack.peek())) {
                        postfixTokens.append(tokensStack.pop()).append(" ");
                    }
                    tokensStack.pop(); // Pop the opening parenthesis
                } else {
                    // If it's any other operator
                    // Pop operators from the stack and append them to the postfix expression
                    // as long as they have higher precedence than the current operator
                    while (!tokensStack.isEmpty() && precedence(currentToken) <= precedence(tokensStack.peek())) {
                        postfixTokens.append(tokensStack.pop()).append(" ");
                    }

                    tokensStack.push(currentToken);
                }
            }
        }
        // Append remaining tokens to postfix
        while (!tokensStack.isEmpty()) {
            postfixTokens.append(tokensStack.pop()).append(" ");
        }

        System.out.println(postfixTokens);
    }

    private static int precedence(String symbol) {
        switch (symbol) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            default:
                return 0;
        }
    }

    public static boolean isNumber(String token) {
        return token.matches("(?<numbers>[a-z]+||\\d+)");
    }

    public static boolean isSign(String token) {
        return token.matches("(?<symbols>[+\\-*/()])");
    }
}
