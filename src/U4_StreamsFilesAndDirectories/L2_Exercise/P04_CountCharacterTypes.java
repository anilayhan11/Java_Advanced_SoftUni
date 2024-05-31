package U4_StreamsFilesAndDirectories.L2_Exercise;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class P04_CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        FileReader fr = new FileReader("C:\\Users\\AnilAyhan\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\AnilAyhan\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt"));
        int oneByte = fr.read();

        while (oneByte >= 0) {
            char symbol = (char) oneByte;

            if (isVowel(symbol)) {
                vowels++;
            } else if (isPunctuation(symbol)) {
                punctuation++;
            } else if (!Character.isWhitespace(symbol)) {
                consonants++;
            }
            oneByte = fr.read();
        }
        fr.close();
        pw.println("Vowels: " + vowels);
        pw.println("Other symbols: " + consonants);
        pw.println("Punctuation: " + punctuation);
        pw.close();
    }

    private static boolean isPunctuation(char symbol) {
        return symbol == '!' || symbol == '.' || symbol == ',' || symbol == '?';
    }

    private static boolean isVowel(char symbol) {
        return symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u';


    }
}
