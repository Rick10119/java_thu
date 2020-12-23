
import java.io.*;

public class HW2 {
    /**
     * Main method
     *
     * @param args[0] for sourcefile
     * @param args[1] for number of small files
     */
    public static void main(String[] args) throws IOException {
        // Check command-line parameter usage
        if (args.length != 2) {
            System.out.println("Usage: java Copy sourceFile targetfile");
            System.exit(1);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        // read the number n of split
        int n = Integer.valueOf(args[1]);
        String targetFileName = args[0];
        int r, numberOfBytesCopied = 0, totalBytes = 0;

        /** to get the total bytes of the file */
        try
                (
                        // Create an input stream
                        BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
                ) {
            while ((r = input.read()) != -1) {
                totalBytes++;
            }
            System.out.println("total bytes: " + totalBytes);

        }

        try
                (
                        // Create an input stream
                        BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
                ) {


            int numberOfBytesToCopyAtI;
            for (int i = 1; i <= n; i++) {

                // 这次要复制到的字节数
                numberOfBytesToCopyAtI = i * totalBytes / n;
                // 这次要创建的文件名（前面加i)
                File targetFile = new File(i + targetFileName);

                try (
                        // Create an output stream
                        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));
                ) {
                    // Continuously read a byte from input and write it to output
                    while (numberOfBytesCopied < numberOfBytesToCopyAtI) {
                        if ((r = input.read()) != -1) {
                            output.write((byte) r);
                            numberOfBytesCopied++;
                        }
                    }

                    // Display the file size
                    System.out.println("\n" + numberOfBytesCopied + " bytes copied");

                }

                try
                        (
                                // Create an input stream for the file
                                FileInputStream input2 = new FileInputStream(targetFile);
                        ) {
                    // Read values from the file
                    int value;
                    while ((value = input2.read()) != -1) {
                        System.out.print(value + " ");
                    }
                }


            }


        }
    }
}
