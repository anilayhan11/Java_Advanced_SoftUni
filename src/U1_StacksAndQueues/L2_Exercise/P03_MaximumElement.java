package U1_StacksAndQueues.L2_Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P03_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> numStack = new ArrayDeque<>();

        int commandsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= commandsCount - 1; i++) {
//      "1 X" - Push the element X into the stack.
//      "2" - Delete the element present at the top of the stack.
//      "3" - Print the maximum element in the stack.

            String[] input = scanner.nextLine().split("\\s+");
            int command = Integer.parseInt(input[0]);

            switch (command) {
                case 1:
                    int x = Integer.parseInt(input[1]);
                    numStack.push(x);
                    break;
                case 2:
                    numStack.pop();
                    break;
                case 3:
                    int biggestNum = Collections.max(numStack);
                    System.out.println(biggestNum);
                    break;
            }
        }
    }
}
