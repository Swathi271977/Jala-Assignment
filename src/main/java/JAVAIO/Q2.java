/**
 * 2. Write a program to write text to .txt file using OutputStream
 */
package JAVAIO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
public class Q2 {
    public static void main(String[] args) {
            String data = "Hello, World! This text is written via OutputStream.";
            File file = new File("output.txt");  // File created in current working directory

            // Try-with-resources ensures the stream is closed automatically
            try (OutputStream out = new FileOutputStream(file)) {
                byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
                out.write(bytes);
                // out.flush();  // Optional: flush before closing
                System.out.println("Data successfully written to " + file.getAbsolutePath());
            } catch (IOException e) {
                System.err.println("Error writing file: " + e.getMessage());
            }
        }
    }


