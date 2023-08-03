package dip;

import java.io.*;

public class FileReader implements ReadInterface {
    private String filePath;

    public void FileContentReader(String filePath) {
        this.filePath = filePath;
    }

    public String readContent() throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        }
        return content.toString();
    }
}