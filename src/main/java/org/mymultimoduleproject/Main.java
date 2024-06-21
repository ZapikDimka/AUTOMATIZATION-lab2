package org.mymultimoduleproject;

import org.ZapikDimka.FileProcessor;
import org.ZapikDimka.FileAnalyzer;
import org.ZapikDimka.FileEncryptor;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();
        FileAnalyzer analyzer = new FileAnalyzer();
        FileEncryptor encryptor = new FileEncryptor();

        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            // Читання файлу
            processor.processFile(inputFile, outputFile);

            // Аналіз файлу
            int wordCount = analyzer.countWords(inputFile);
            System.out.println("Word count: " + wordCount);

            // Шифрування файлу
            encryptor.encryptFile(inputFile, "encrypted_output.txt");
            System.out.println("File encrypted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
