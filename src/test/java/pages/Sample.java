package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path to the Word document (e.g., document.docx):");
        String filePath = scanner.nextLine();

        File wordFile = new File(filePath);

        if (!wordFile.exists()) {
            System.out.println("File not found. Please check the path and try again.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(wordFile);
             XWPFDocument document = new XWPFDocument(fis);
             XWPFWordExtractor extractor = new XWPFWordExtractor(document)) {

            // Extract text from the Word document
            String text = extractor.getText().toLowerCase();

            // Ask the user for the word to search
            System.out.println("Enter the word you want to search:");
            String searchWord = scanner.nextLine().toLowerCase();

            // Count occurrences of the word
            int wordCount = 0;
            String[] words = text.replaceAll("[^a-zA-Z0-9]", " ").split("\\s+");
            for (String word : words) {
                if (word.equals(searchWord)) {
                    wordCount++;
                }
            }

            // Display the result
            System.out.println("The word \"" + searchWord + "\" appears " + wordCount + " time(s) in the document.");

        } catch (IOException e) {
            System.out.println("An error occurred while processing the file: " + e.getMessage());
        }
    }
}
