package U4_StreamsFilesAndDirectories.L1_Lab;

import java.io.File;

public class P07_ListFiles {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\AnilAyhan\\Downloads\\04-Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\");

        if (folder.exists()) {
            if (folder.isDirectory()) {
                File[] allFiles = folder.listFiles();
                for (File file : allFiles) {
                    if (!file.isDirectory()) {
                        System.out.printf("%s: [%d]%n", file.getName(), file.length());
                    }
                }
            }
        }
    }
}
