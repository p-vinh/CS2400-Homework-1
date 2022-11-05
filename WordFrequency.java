import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordFrequency {

    public static void main(String[] args) {
        WordCount wordCounter = new WordCount();

        try {
            Scanner scan = new Scanner(new File(".\\usconstitution.txt"));
            wordCounter.readFile(scan);
        } catch (FileNotFoundException fe) {
            fe.getStackTrace();
        }

        wordCounter.display();
    }
}
