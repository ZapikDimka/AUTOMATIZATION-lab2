package org.ZapikDimka;

import java.io.BufferedReader;
import java.io.IOException;

public class FileAnalyzer {
    public int countWords(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath));
        String line;
        int wordCount = 0;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }
        reader.close();
        return wordCount;
    }
}
