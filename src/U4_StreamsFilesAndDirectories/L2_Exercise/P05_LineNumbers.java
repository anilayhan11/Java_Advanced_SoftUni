package U4_StreamsFilesAndDirectories.L2_Exercise;

import java.io.*;

public class P05_LineNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\AnilAyhan\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\AnilAyhan\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt"));
        String line = br.readLine();
        int counter = 1;
        while(line != null){
            pw.println(counter + ". " + line);
            counter++;
            line = br.readLine();
        }
        br.close();
        pw.close();
    }
}