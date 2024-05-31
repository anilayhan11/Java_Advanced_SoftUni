package U4_StreamsFilesAndDirectories.L2_Exercise;

import java.io.File;
import java.util.ArrayDeque;

public class P08_GetFolderSize {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\AnilAyhan\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");
        ArrayDeque<File> directories = new ArrayDeque<>();
        directories.offer(folder);

        int sumOfBytes = 0;

        while (!directories.isEmpty()) {
            File current = directories.poll();
            File[] files = current.listFiles();

            for (File file : files) {
                if (file.isDirectory()) {
                    directories.offer(file);
                } else {
                    sumOfBytes += file.length();
                }
            }
        }

        System.out.println("Folder size: " + sumOfBytes);
    }
}
