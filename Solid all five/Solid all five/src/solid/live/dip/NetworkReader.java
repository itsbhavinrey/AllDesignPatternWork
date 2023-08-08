package solid.live.dip;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkReader implements Reader {
    private URL url;

    public NetworkReader(String urlString) throws MalformedURLException {
        this.url = new URL(urlString);
    }

    @Override
    public String read() {
        try (InputStream in = url.openStream();
             InputStreamReader reader = new InputStreamReader(in)) {
            StringBuilder content = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                content.append((char) c);
            }
            return content.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
