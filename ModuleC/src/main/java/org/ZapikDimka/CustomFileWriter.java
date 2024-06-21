package org.ZapikDimka;

import java.io.FileWriter;
import java.io.IOException;

public class CustomFileWriter {
    public void writeFile(String filePath, String content) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        writer.write(content);
        writer.close();
    }
}

