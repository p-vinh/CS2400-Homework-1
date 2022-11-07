
import java.util.Iterator;
import java.util.Scanner;

public class WordCount {
    private InterfaceDictionary<String, WordCount> dict;
    private int count;

    public WordCount() {
        count = 1;
        dict = new MapDictionary<>();
    }

    public void readFile(Scanner scan) {
        scan.useDelimiter("\\W+");
        while (scan.hasNext()) {
            String nextWord = scan.next().toLowerCase();

            if (!dict.contains(nextWord))
                dict.add(nextWord, new WordCount());
            else
                dict.getValue(nextWord).increment();
        }

    }

    public void increment() {
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public void display() {
        System.out.println("Word Frequency by V. Pham");
        System.out.println();
        System.out.println("Count  Word");
        System.out.println("-----  --------------------------");
        Iterator<String> iterate = dict.getKeyIterator();

        while (iterate.hasNext()) {
            String key = iterate.next();
            System.out.printf("%s %n", dict.getValue(key).getCount() + "  " + key);
        }

        System.out.println("Total = " + dict.getSize());
    }
}
