/**
     * 10.Write a program to generate ClassNotFoundException
     */

    package EXCEPTIONS;

   public class ClassNotFoundExample {

    public static void main(String[] args) {
        try {
            // Attempt to load a class that doesn't exist
            Class.forName("com.exceptions.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught Exception: " + e);
            e.printStackTrace();
        }
    }
}


