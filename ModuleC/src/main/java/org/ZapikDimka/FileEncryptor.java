package org.ZapikDimka;

import java.io.FileWriter;
import java.io.IOException;

public class FileEncryptor {
    public void encryptFile(String inputFilePath, String outputFilePath) throws IOException {
        java.io.FileReader reader = new java.io.FileReader(inputFilePath);
        FileWriter writer = new FileWriter(outputFilePath);
        int c;
        while ((c = reader.read()) != -1) {
            writer.write(c + 1); // просте шифрування шляхом зміщення кожного символу на 1
        }
        reader.close();
        writer.close();
    }
}
