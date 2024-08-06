package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentWord {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        String mostFrequentWord = null;
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentWord = entry.getKey();
            } else if (entry.getValue() == maxFrequency) {
                if (entry.getKey().compareTo(mostFrequentWord) > 0) {
                    mostFrequentWord = entry.getKey();
                }
            }
        }

        System.out.println(mostFrequentWord + " " + maxFrequency);
	}
}
