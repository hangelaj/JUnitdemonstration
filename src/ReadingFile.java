import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
    public static void main(String[] args) {

        try {
            String pathname = "/Users/Student/Desktop/file.txt";
            File file = new File(pathname);

            if (!file.exists()) {
                System.out.println("File does not exist.");
                return;
            }

            // Open the file for reading
            FileReader fileReader = new FileReader(file);

            // Create a BufferedReader to read text
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the resources
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}