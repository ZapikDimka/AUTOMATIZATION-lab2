package org.ZapikDimka;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class FileProcessor {
    private FileReader fileReader;
    private FileWriter fileWriter;

    public FileProcessor(FileReader fileReader, FileWriter fileWriter) {
        this.fileReader = fileReader;
        this.fileWriter = fileWriter;
    }

    public void processFile(String inputFile, String outputFile) {
        try {
            List<String> content = fileReader.readFile(inputFile);
            List<String> processedContent = processContent(content);
            fileWriter.writeFile(outputFile, processedContent);
            System.out.println("File processing completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> processContent(List<String> content) {
        return content.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        FileReader reader = new FileReader();
        FileWriter writer = new FileWriter();
        FileProcessor processor = new FileProcessor(reader, writer);

        processor.processFile(inputFile, outputFile);
    }
}
