package org.ZapikDimka;

import java.io.IOException;

public class FileProcessor {
    private FileReader fileReader;
    private CustomFileWriter fileWriter;
    private FileAnalyzer fileAnalyzer;
    private FileEncryptor fileEncryptor;

    public FileProcessor() {
        this.fileReader = new FileReader();
        this.fileWriter = new CustomFileWriter();
        this.fileAnalyzer = new FileAnalyzer();
        this.fileEncryptor = new FileEncryptor();
    }

    public void processFiles(String inputFile, String outputFile, String encryptedOutputFile) throws IOException {
        // Читання файлу
        String content = fileReader.readFile(inputFile);

        // Запис файлу
        fileWriter.writeFile(outputFile, content);

        // Аналіз файлу
        int wordCount = fileAnalyzer.countWords(inputFile);
        System.out.println("Word count: " + wordCount);

        // Шифрування файлу
        fileEncryptor.encryptFile(inputFile, encryptedOutputFile);
        System.out.println("File encrypted successfully.");
    }

    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();

        String inputFile = "input.txt";
        String outputFile = "output.txt";
        String encryptedOutputFile = "encrypted_output.txt";

        try {
            processor.processFiles(inputFile, outputFile, encryptedOutputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
