package U4_StreamsFilesAndDirectories.L1_Lab;

import java.io.FileInputStream;
import java.io.IOException;

public class P01_ReadFile {
        public static void main(String[] args) throws IOException {
            String path = "C:\\Users\\AnilAyhan\\Downloads\\04-Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
            FileInputStream inputStream = new FileInputStream(path);

            int currentByte = inputStream.read();

            while (currentByte >= 0) {
                System.out.print(Integer.toBinaryString(currentByte) + " ");
                currentByte = inputStream.read();
            }

            inputStream.close();
        }
    }