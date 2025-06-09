package pages;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CountLetterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to find the occurrence of each letter in a given string.
//Write a Java program to return the most frequent character in a string.
		String str = "LathaKarthikHevanikaMounika";
		char[] ch = str.toCharArray();
	
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		Set<Character> keys = map.keySet();

		for (char k : keys) {
			if (map.get(k) > 1) {
				System.out.println(k + ":" + map.get(k));
			}
		}

		// Convert the string to a stream of characters and group by their frequency
		Map<Character, Long> frequencyMap = str.chars().mapToObj(c -> (char) c) // Convert IntStream to
																				// Stream<Character>
				.filter(Character::isLetter) // Only consider letters
				.collect(Collectors.groupingBy(Character::toLowerCase, // Make it case-insensitive
						Collectors.counting() // Count occurrences
				));

		// Print the frequency of each letter
		System.out.println("Letter frequencies:");
		frequencyMap.forEach((letter, count) -> System.out.println(letter + " -> " + count));

		// Convert the string to a stream of characters and group by their frequency
		Map<Character, Long> frequencyMap1 = str.chars().mapToObj(c -> (char) c) // Convert IntStream to
																					// Stream<Character>
				.filter(Character::isLetter) // Only consider letters
				.collect(Collectors.groupingBy(Character::toLowerCase, // Make it case-insensitive
						Collectors.counting() // Count occurrences
				));

		// Filter and print only duplicate characters
		System.out.println("Duplicate characters:");
		frequencyMap.entrySet().stream().filter(entry -> entry.getValue() > 1) // Find entries with frequency > 1
				.forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

		// Convert the string to a stream of characters and group by their frequency
		Map<Character, Long> frequencyMap2 = str.chars().mapToObj(c -> (char) c) // Convert IntStream to
																					// Stream<Character>
				.filter(Character::isLetter) // Only consider letters
				.collect(Collectors.groupingBy(Character::toLowerCase, // Make it case-insensitive
						Collectors.counting() // Count occurrences
				));

		// Find the duplicate characters
		Map<Character, Long> duplicates = frequencyMap.entrySet().stream().filter(entry -> entry.getValue() > 1) // Filter
																													// duplicates
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		// Find the maximum frequency
		Optional<Map.Entry<Character, Long>> maxEntry = duplicates.entrySet().stream()
				.max(Map.Entry.comparingByValue());

		// Display results
		System.out.println("Duplicate characters:");
		duplicates.forEach((character, count) -> System.out.println(character + " -> " + count));

		if (maxEntry.isPresent()) {
			System.out.println("\nCharacter with the highest frequency: " + maxEntry.get().getKey() + " -> "
					+ maxEntry.get().getValue());
		}

	}

}
