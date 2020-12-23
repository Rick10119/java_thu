// Example for PPT Page No.21

public class FinallyDemo {
    public static void main(String[] args) {
        java.io.PrintWriter output = null;

        try {
            // Create a output file
            output = new java.io.PrintWriter("text.txt");

            // Write formatted output to the file
            output.println("Welcome to Java!");
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("finally process");
            // Close the file
            if (output != null) {
                output.close();
            }
        }

        System.out.println("End of the program");
    }
}