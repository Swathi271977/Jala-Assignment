package EXCEPTIONS;
import java.lang.reflect.Method;

    /**
     * 14.Write a program to generate NoSuchMethodException
     */
    //creating a class
    class E_14 {
        //creating a method which receives two integer values as parameters
        public void addition(int a, int b) {
            int c;
            c = a + b;
            System.out.println(c);
        }
    }

    public class NoSuchMethodException {
        public static void main(String[] args) {

            try {
                Class c = Class.forName("com.jala.exceptions.E_14");
                //There is no subtraction() method in class E_14
                Method m = c.getDeclaredMethod("subtraction", int.class, int.class);
            }
            //Throws NoSuchMethodException
            catch (java.lang.NoSuchMethodException | ClassNotFoundException e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
                e.printStackTrace();
            }
        }
    }

