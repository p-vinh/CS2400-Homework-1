import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;

public class WordFrequency {
    public static void main(String[] args) {
		InterfaceDictionary<String, WordCount> dict = new MapDictionary<>();

        try {
            Scanner scan = new Scanner(new File(".\\usconstitution.txt"));
			scan.useDelimiter("\\W+");

			while (scan.hasNext()) {
				String nextWord = scan.next().toLowerCase();

				if (nextWord.matches("[a-zA-Z]+")) {
					if (!dict.contains(nextWord))
						dict.add(nextWord, new WordCount());
					else
						dict.getValue(nextWord).increment();
				}
			}
        } catch (FileNotFoundException fe) {
            fe.getStackTrace();
        }

		System.out.println("Word Frequency by V. Pham");
		System.out.println();
		System.out.println("Count  Word");
		System.out.println("-----  --------------------------");

		Iterator<String> iterate = dict.getKeyIterator();

		while (iterate.hasNext()) {
			String key = iterate.next();

			System.out.printf("%-3s %-3s\n", dict.getValue(key).getCount(), key);
		}

		System.out.println("Total = " + dict.getSize());
    }
}
