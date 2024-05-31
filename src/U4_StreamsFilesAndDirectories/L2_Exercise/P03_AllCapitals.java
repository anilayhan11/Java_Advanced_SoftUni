package U4_StreamsFilesAndDirectories.L2_Exercise;

import java.io.*;

public class P03_AllCapitals {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\AnilAyhan\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt"));
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\AnilAyhan\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));
        br.lines().forEach(line -> pw.println(line.toUpperCase()));
        br.close();
        pw.close();
    }
}
