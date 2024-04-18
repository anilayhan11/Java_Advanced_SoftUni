//Solution with stream
package U1_StacksAndQueues.L2_Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P01_ReverseNumbersWithStack2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> numbersStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).forEach(numbersStack::push);

        while (!numbersStack.isEmpty()) {
            System.out.print(numbersStack.pop() + " ");

        }
    }
}

