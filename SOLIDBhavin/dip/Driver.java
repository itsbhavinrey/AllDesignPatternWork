package dip;

public class Driver {
    public static void main(String[] args) {
        String filePath = "/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt";
        String url = "http://myfirstappwith.appspot.com/index.html";

        EncodingModule encodingModule = new EncodingModule(
                new FileReader(filePath),
                new FileWriter("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt"),
                new NetworkReader(url),
                new DatabaseWriter()
        );

        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase();
    }
}
