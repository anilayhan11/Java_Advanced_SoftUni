package U8_Generics.L1_Lab.P01_JarOfT;

import java.util.ArrayDeque;

public class Jar<T> {
    private ArrayDeque<T> stack;
    //place to store data

    public Jar() {
        //new jar
        this.stack = new ArrayDeque<>();
    }
    public void add (T element) {
        this.stack.push(element);
    }

    public T remove() {
        return this.stack.pop();
    }

}