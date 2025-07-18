/**
     * 11.Write a program to generate FileNotFoundException
     */
    package EXCEPTIONS;
import java.io.*;

    // FileNotFoundException occurs when we attempt to open the file denoted by a specified pathname has failed.

public class FileNotFoundExample {
    public static void main(String[] args) {
        String invalidPath = "/invalid/file/location.txt";

        try {
            // Attempt to open a non-existent file
            BufferedReader reader = new BufferedReader(new FileReader(invalidPath));
            // If file existed, we could read from reader...
            reader.close();
        } catch (java.io.FileNotFoundException e) {
            System.err.println("FileNotFoundException caught!");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Other I/O error occurred.");
            e.printStackTrace();
        }
    }
}


