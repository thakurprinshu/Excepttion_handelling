import java.io.IOException;

public class Chain_Exce {
    public static void readFile() throws Exception {
        try {
            throw new IOException("File not found!");
        } catch (IOException e) {
            throw new Exception("Error occurred while reading file", e); // Chained exception
        }
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }
}

