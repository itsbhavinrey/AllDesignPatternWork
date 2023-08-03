package dip;

import java.io.*;

public class FileWriter  {
    private String filePath;

    public void FileContentWriter(String filePath) {
        this.filePath = filePath;
    }

    public void writeContent(String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }
}
