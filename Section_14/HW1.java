
import java.io.*;

public class HW1 {
    public static void main(String[] args) throws IOException {

        int randomInt = 0;
        try
                (
                        // Create an output stream to the file
                        FileOutputStream output = new FileOutputStream("Data.txt", true);
                ) {
            // Output values to the file
            for (int i = 1; i <= 100; i++) {
                // row an int and write it to the file
                randomInt = (int) (100 * Math.random());
                output.write(randomInt);
                output.write(' ');
            }

        }

        try
                (
                        // Create an input stream for the file
                        FileInputStream input = new FileInputStream("Data.txt");
                ) {
            // Read values from the file
            int value;
            while ((value = input.read()) != -1) {
                System.out.print(value + " ");
            }
        }
    }
}