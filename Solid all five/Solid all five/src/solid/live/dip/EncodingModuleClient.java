package solid.live.dip;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
//        EncodingModule encodingModule  = new EncodingModule();
//        encodingModule.encodeWithFiles();
//        encodingModule.encodeBasedOnNetworkAndDatabase();

        EncodingModule fileEncodingModule = new EncodingModule(
                new FilesReader("C:/Users/tejas.ko/Downloads/Solid all five/Solid all five/src/solid/live/dip/beforeEncryption.txt"),
                new Base64Encoder(),
                new FilesWriter("C:/Users/tejas.ko/Downloads/Solid all five/Solid all five/src/solid/live/dip/afterEncryption.txt")
        );
        fileEncodingModule.encodeAndWrite();


        String urlString = "http://myfirstappwith.appspot.com/index.html";

        EncodingModule networkEncodingModule = new EncodingModule(
                new NetworkReader(urlString),
                new Base64Encoder(),
                new DatabaseWriter()
        );
        networkEncodingModule.encodeAndWrite();



    }
}
