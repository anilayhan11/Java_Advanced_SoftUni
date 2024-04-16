package U1_StacksAndQueues.L1_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05_PrinterQueue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> files = new ArrayDeque<>();

        while (!"print".equals(input)) {

            if ("cancel".equals(input)) {
                if (files.isEmpty()) {
                    System.out.println("Printer is on standby");

                } else {
                    System.out.println("Canceled " + files.poll());
                }

            } else {
                files.offer(input);
            }

            input = scanner.nextLine();
        }

        while (!files.isEmpty()) {
            System.out.println(files.pollFirst());
        }
    }
}
