package U1_StacksAndQueues.L1_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08_BrowserHistoryUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();

        String line = scanner.nextLine();

        while (!"Home".equals(line)) {

            if (!"back".equals(line)) {
                history.push(line);
                System.out.println(line);

            } else {
                if (history.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    history.pop();
                    System.out.println(history.peek());
                }
            }

            line = scanner.nextLine();
        }
    }
}
