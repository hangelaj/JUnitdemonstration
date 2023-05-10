import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) {
        String Javafile = "/Users/Student/Desktop/file.txt";
        File file = new File(Javafile);

        try {
            if (file.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("The file already exists.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
