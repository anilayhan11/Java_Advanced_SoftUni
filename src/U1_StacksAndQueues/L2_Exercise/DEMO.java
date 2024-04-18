package U1_StacksAndQueues.L2_Exercise;

public class DEMO {
    public static void main(String[] args) {

        Recursion(0);
    }

    private static void Recursion(int count) {

        if (count == 10) {
            return;
        }

        System.out.println(count++);
        Recursion(count);
    }
}
