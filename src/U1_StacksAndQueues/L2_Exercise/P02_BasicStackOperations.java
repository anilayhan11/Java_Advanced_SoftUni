package U1_StacksAndQueues.L2_Exercise;

import java.util.*;
import java.util.stream.Stream;

public class P02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbersArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int n = numbersArr[0];
        int s = numbersArr[1];
        int x = numbersArr[2];

        Deque<Integer> numbersStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).forEach(numbersStack::push);

        for (int i = 1; i <= s; i++) {
            numbersStack.pop();
        }

        if (numbersStack.contains(x)) {
            System.out.println("true");
        } else {
            if (numbersStack.isEmpty()) {
                System.out.println(0);
            } else {
                int smallestNum = Collections.min(numbersStack);
                System.out.println(smallestNum);
            }
        }
    }
}
