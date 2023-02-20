import java.util.HashMap;
import java.util.Scanner;

public class CountOfSen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");

        String sentence = scanner.nextLine();

        HashMap<String, Integer> wordFrequency = new HashMap<>();

        String[] words = sentence.split(" ");

        for (String word : words) {

            if (wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            }

            else {
                wordFrequency.put(word, 1);
            }
        }
        System.out.println("Number of words in the sentence: " + words.length);
        System.out.println("Word frequency in the sentence:");
        for (String word : wordFrequency.keySet()) {
            System.out.println(word + ": " + wordFrequency.get(word));
        }
    }
}
