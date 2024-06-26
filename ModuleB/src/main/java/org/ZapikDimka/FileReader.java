package org.ZapikDimka;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {
    public String readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();
        return content.toString();
    }
}
