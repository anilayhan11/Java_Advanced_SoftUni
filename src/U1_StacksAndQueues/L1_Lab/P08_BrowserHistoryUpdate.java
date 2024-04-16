package U1_StacksAndQueues.L1_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08_BrowserHistoryUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> historyBack = new ArrayDeque<>();
        ArrayDeque<String> historyForward = new ArrayDeque<>();

        String line = scanner.nextLine();

        while (!"Home".equals(line)) {

            if (!"back".equals(line) && !"forward".equals(line)) {
                historyBack.push(line);
                System.out.println(line);

                historyForward.clear();

            } else {
                if ("back".equals(line)) {
                    if (historyBack.size() <= 1) {
                        System.out.println("no previous URLs");
                    } else {
                        String currentLink = historyBack.pop();
                        historyForward.push(currentLink);
                        System.out.println(historyBack.peek());
                    }
                } else {
                    if (historyForward.isEmpty()) {
                        System.out.println("no next URLs");
                    } else {
                        String currentLink = historyForward.pop();
                        historyBack.push((currentLink));
                        System.out.println(currentLink);
                    }
                }
            }

            line = scanner.nextLine();
        }
    }
}