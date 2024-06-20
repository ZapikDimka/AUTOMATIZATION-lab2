package org.ZapikDimka;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileWriter {
    public void writeFile(String filePath, List<String> content) throws IOException {
        Files.write(Paths.get(filePath), content);
    }
}
