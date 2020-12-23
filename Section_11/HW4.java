import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class HW4 {
    /**
     * to test
     */
    public static void main(String[] args) {

// Declare the scanner
        Scanner input;
        double sum = 0;
        int j = 0;// number of the /s

        /** to open the file */
        try {
            input = new Scanner(new File("a.txt"));

            /** to read it */
            String line = input.nextLine();

            for (int i = 0; ; ) {

                // read the numbers, with a max value of 99
                int num, denom;

                /** read the blank unless the first time */
                if (i != 0) {
                    System.out.print("read the blank...\n");

                    if (line.charAt(i) != ' ') {
                        throw new InputMismatchException("Wrong format at " + i + "th column");
                    } else {
                        i++;
                    }
                }

                /** read the numerator */
                System.out.print("read the numerator...\n");
                if (Character.isDigit(line.charAt(i))) {
                    num = (int) line.charAt(i) - (int) ('0');
                    i++;
                    if (Character.isDigit(line.charAt(i))) {
                        num = num * 10 + (int) line.charAt(i) - (int) ('0');
                        i++;
                    }
                } else {
                    throw new InputMismatchException("Wrong format number at " + i + "th column");
                }

                /** read the oparator */
                System.out.print("read the operator...\n");
                if (line.charAt(i) != '/') {
                    throw new InputMismatchException("Wrong format operator at " + i + "th column");

                } else {
                    i++;
                }


                /** read the denominator */
                System.out.print("read the denominator...\n\n");
                if (Character.isDigit(line.charAt(i))) {
                    denom = (int) line.charAt(i) - (int) ('0');
                    i++;

                } else {
                    throw new InputMismatchException("Wrong format number at " + i + "th column");
                }

                /** judge whether reading is finished */
                if (i >= line.length()) {
                    break;
                } else if (Character.isDigit(line.charAt(i))) {
                    denom = denom * 10 + (int) line.charAt(i) - (int) ('0');
                    i++;
                }

                /** add to the sum */
                sum += (double) num / (double) denom;
                j++;
            }


            // Display the result when the number is entered successfully
            System.out.println("The sum is: " + sum);
            System.out.println("The average is: " + sum / j);

        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (InputMismatchException ex) {
            System.out.println(ex.toString());
        }


    }


}

