package U7_Workshop.L1_Lab;

public class Main {
    public static void main(String[] args) {

        SmartStack stack = new SmartStack();

        stack.push(13);
        stack.push(42);
        stack.push(69);
        stack.push(73);

        stack.forEach(System.out::println);
    }
}