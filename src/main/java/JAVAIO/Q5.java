/**
 *5.Write a program to read text from .txt file using FileReader
 */
package JAVAIO;
import java.io.FileReader;
import java.io.IOException;

public class Q5 {
    public static void main(String[] args) {
        // FileReader class is used to write character-oriented data to a file.
        try {
                    // Creates a FileReader
                    //file path passed as parameter to the FileReader constructor.
                    FileReader fr = new FileReader("fw.txt");

                    int i;
                    //If the read() method returns -1, there is no more data to read in the FileReader
                    while ((i = fr.read()) != -1) {
                        //reads all characters one char at a time from the FileReader.
                        System.out.print((char) i);
                    }
                    //closing FileReader
                    fr.close();

                } catch (Exception e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
                    e.printStackTrace();
                }
            }
        }



