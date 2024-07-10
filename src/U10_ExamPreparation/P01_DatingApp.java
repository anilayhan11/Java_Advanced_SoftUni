package U10_ExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class P01_DatingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> maleStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(maleStack::push);

        Deque<Integer> femaleQueue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(femaleQueue::offer);

        int matches = 0;

        while (!maleStack.isEmpty() && !femaleQueue.isEmpty()) {
            int male = maleStack.peek();
            int female = femaleQueue.peek();

            if (female <= 0) {
                femaleQueue.poll();
                continue;
            } else if (male <= 0) {
                maleStack.pop();
                continue;
            }

            if (female % 25 == 0) {
                femaleQueue.poll();
                femaleQueue.poll();
                continue;
            } else if (male % 25 == 0) {
                maleStack.pop();
                maleStack.pop();
                continue;
            }

            if (male == female) {
                matches++;
                maleStack.pop();
                femaleQueue.poll();
            } else {
                femaleQueue.poll();
                int decreasedMale = maleStack.pop() - 2;
                maleStack.push(decreasedMale);
            }

        }
        System.out.printf("Matches: %d\n", matches);
        System.out.printf("Males left: %s\n", result(maleStack));
        System.out.printf("Females left: %s", result(femaleQueue));
    }

    private static String result(Deque<Integer> arrDeque) {

        String result = "none";

        if (!arrDeque.isEmpty()) {
            result = arrDeque.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
        }

        return result;
    }
}