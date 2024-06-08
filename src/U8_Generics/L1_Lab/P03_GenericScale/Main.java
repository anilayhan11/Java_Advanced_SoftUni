package U8_Generics.L1_Lab.P03_GenericScale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> scale = new Scale<>(5, 9);
        System.out.println(scale.getHeavier());

    }
}