package solid.live.dip;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilesWriter implements Writer {
    private String filePath;

    public FilesWriter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}