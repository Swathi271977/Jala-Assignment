/**
 * 1. Write a program to read text from .txt file using InputStream
 */
package JAVAIO;
import java.io.FileInputStream;
import java.io.IOException;
public class Q1 {
    public static void main(String[] args) {

            // ✅ Provide the correct path to your .txt file
        String filePath = "C:\\Users\\swath\\IdeaProjects\\Jalaassignments\\sample.txt";


        FileInputStream inputStream = null;

            try {
                inputStream = new FileInputStream(filePath);
                int byteData;

                System.out.println("Reading contents of file using InputStream:");

                // Read each byte until end of file (-1)
                while ((byteData = inputStream.read()) != -1) {
                    // Convert byte to char and print
                    System.out.print((char) byteData);
                }

            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());

            } finally {
                try {
                    if (inputStream != null)
                        inputStream.close();  // Close stream to release resource
                } catch (IOException e) {
                    System.out.println("Error closing stream: " + e.getMessage());
                }
            }
        }
    }


