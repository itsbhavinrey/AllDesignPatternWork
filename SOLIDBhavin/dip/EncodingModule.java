public class EncodingModule {
    private ReadInterface fileReader;
    private FileWriterInterface fileWriter;
    private NetworkReaderInterface networkReader;
    private DatabaseWriterInterface databaseWriter;

    public EncodingModule(ReadInterface fileReader,
                          FileWriterInterface fileWriter,
                          NetworkReaderInterface networkReader,
                          DatabaseWriterInterface databaseWriter) {
        this.fileReader = fileReader;
        this.fileWriter = fileWriter;
        this.networkReader = networkReader;
        this.databaseWriter = databaseWriter;
    }

    public void encodeWithFiles() {
        try {
            String content = fileReader.readContent();
            String encodedContent = Base64.encodeBytes(content.getBytes());
            fileWriter.writeContent(encodedContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void encodeBasedOnNetworkAndDatabase() {
        try {
            String content = networkReader.readFromNetwork();
            String encodedContent = Base64.encodeBytes(content.getBytes());
            databaseWriter.writeToDatabase(encodedContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}