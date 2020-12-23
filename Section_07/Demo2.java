// Example for PPT page No.15

public class Demo2 {
    // Read the first parameters as the string which will be printed, and 2nd for times
    public static void main(String[] args) {
        // Read the n from command line
        String str = args[0];
        int n = Integer.parseInt(args[1]);

        // Traditional method
        System.out.println("--- Using traditional method ---");

        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }

        // Recursive method
        System.out.println("--- Using recursive method ---");
        printString(str, n);
    }

    // Method for print the string with recursive way
    public static void printString(String s, int i) {
        if (i > 0) {
            System.out.println(s);
            printString(s, i - 1);
        }
    }
}