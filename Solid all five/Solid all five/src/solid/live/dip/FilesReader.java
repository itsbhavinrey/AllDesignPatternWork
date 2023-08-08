package solid.live.dip;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilesReader implements Reader {
    private String filePath;

    public FilesReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            return content.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}