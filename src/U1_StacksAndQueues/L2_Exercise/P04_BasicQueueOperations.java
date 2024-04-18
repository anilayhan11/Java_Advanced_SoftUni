package U1_StacksAndQueues.L2_Exercise;

import java.util.*;

public class P04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbersArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int n = numbersArr[0];
        int s = numbersArr[1];
        int x = numbersArr[2];

        Deque<Integer> numbersQueue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).forEach(numbersQueue::offer);

        for (int i = 1; i <= s; i++) {
            numbersQueue.poll();
        }

        if (numbersQueue.contains(x)) {
            System.out.println("true");
        } else {
            if (numbersQueue.isEmpty()) {
                System.out.println(0);
            } else {
                int smallestNum = Collections.min(numbersQueue);
                System.out.println(smallestNum);
            }
        }
    }
}