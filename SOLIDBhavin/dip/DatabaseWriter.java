package dip;

public class DatabaseWriter {
    public void writeToDatabase(String content) {
        MyDatabase database = new MyDatabase();
        database.write(content);
    }
}