package U1_StacksAndQueues.L2_Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P01_ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        Deque<Integer> numbersStack = new ArrayDeque<>();

        for (int i : numbersArr) {
            numbersStack.push(i);
        }

        numbersStack.reversed();
        while (!numbersStack.isEmpty()) {
            System.out.print(numbersStack.pop() + " ");

        }
    }
}
