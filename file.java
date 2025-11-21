import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write("Hello, this is a text written to the file!");
            System.out.println("Файл успішно записано.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
