package U1_StacksAndQueues.L1_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        String[] tokens = expression.split("\\s+");

        ArrayDeque<String> resultStack = new ArrayDeque<>();

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];
            resultStack.push(token);
        }

        while (resultStack.size() > 1) {
            int firstNum = Integer.parseInt(resultStack.pop());
            String operator = resultStack.pop();
            int secondNum = Integer.parseInt(resultStack.pop());

            switch (operator) {
                case "+":
                    resultStack.push(String.valueOf(firstNum + secondNum));
                    break;
                case "-":
                    resultStack.push(String.valueOf(firstNum - secondNum));
                    break;
            }
        }
        System.out.println(resultStack.pop());
    }
}
