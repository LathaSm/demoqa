package pages;
// TODO Auto-generated method stub
import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.*;


public class WordSearchFile {

	public static void main(String[] args) {
	
	
		        Scanner scanner = new Scanner(System.in);

		        try {
		            // Prompt user for Word document file path
		            System.out.println("Enter the path to the Word document (e.g., document.docx):");
		            String filePath = scanner.nextLine();

		            File wordFile = new File(filePath);

		            // Check if file exists
		            if (!wordFile.exists()) {
		                System.out.println("File not found. Please check the path and try again.");
		                return;
		            }

		            // Extract text from the Word document
		            String text;
		            try (FileInputStream fis = new FileInputStream(wordFile);
		                 XWPFDocument document = new XWPFDocument(fis);
		                 XWPFWordExtractor extractor = new XWPFWordExtractor(document)) {

		                text = extractor.getText().toLowerCase();
		            }

		            // Tokenize text into words using streams
		            List<String> words = Arrays.stream(text.replaceAll("[^a-zA-Z0-9\\s]", " ")
		                                                   .split("\\s+"))
		                                       .filter(word -> !word.isEmpty())
		                                       .collect(Collectors.toList());

		            // Create a frequency map using Java 8 streams
		            Map<String, Long> wordFrequency = words.stream()
		                                                   .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

		            // Prompt user for words to search
		            System.out.println("Enter the words you want to search, separated by commas:");
		            String[] searchWords = scanner.nextLine().toLowerCase().split(",");

		            // Display and save results using Streams
		            File resultFile = new File("word_frequency_results_java8.txt");
		            try (PrintWriter writer = new PrintWriter(new FileWriter(resultFile))) {
		                Arrays.stream(searchWords)
		                      .map(String::trim)
		                      .forEach(searchWord -> {
		                          long count = wordFrequency.getOrDefault(searchWord, 0L);
		                          String result = "The word \"" + searchWord + "\" appears " + count + " time(s) in the document.";
		                          System.out.println(result);
		                          writer.println(result);
		                      });
		                System.out.println("\nResults saved to: " + resultFile.getAbsolutePath());
		            }

		        } catch (IOException e) {
		            System.out.println("An error occurred: " + e.getMessage());
		        } finally {
		            scanner.close(); // Ensure scanner resource is closed
		        }
		    }
		}

