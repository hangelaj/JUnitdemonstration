import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {
    public static void main(String[] args) {

        try {
            String pathname = "/Users/Student/Desktop/file.txt";
            File file = new File(pathname);
            if (file.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("The file already exists.");
                System.out.println("Pleas show me what in this file.");
            }

            // Open the file for writing
            FileWriter fileWriter = new FileWriter(file);

            // Create a BufferedWriter to write text
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write content to the file
            bufferedWriter.write("Hello, world!");
            bufferedWriter.write("I love writing to my file!");

            // Close the resources
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Content written to the file.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}