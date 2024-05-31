package U4_StreamsFilesAndDirectories.L2_Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P02_SumBytes {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\AnilAyhan\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));

        String line = bufferedReader.readLine();
        long sum = 0;

        while (line != null) {
            char[] charactersFromLine = line.toCharArray();
            for (char character : charactersFromLine) {
                sum += character;
            }

            line = bufferedReader.readLine();
        }

        System.out.println(sum);
        bufferedReader.close();
    }
}
