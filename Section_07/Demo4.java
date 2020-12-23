// Example for PPT page No.17

public class Demo4 {
    public static void main(String[] args) {
        // Create the chess table for 8x8
        int[][] table = new int[8][8];

        // Search the chess table
        search(table);

    }

    // The initial search method
    public static void search(int[][] table) {
        // Set up the search method
        if (search(table, 0, 0)) {
            printTable(table);
        } else {
            System.out.println("Sorry, I cannot find one!");
        }
    }

    // Recursive method for search the right position (overload)
    public static boolean search(int[][] table, int r, int c) {
        // Check if searching in invalid row (8)
        if (r == 8) return true;

        // Check if the queen will be set on in row r, and from position c to 7
        for (int j = c; j < 8; j++) {
            // Set the queen on the table
            table[r][j] = 1;

            // Check if the position is valid
            if (valid(table, r, j)) {
                // Move to search next row
                if (search(table, r + 1, 0)) {
                    return true;
                }
            }

            table[r][j] = 0;
        }

        // Means no position is valid
        return false;
    }

    // Check if the position is valid
    public static boolean valid(int[][] a, int r, int c) {
        if (!rowValid(a, r)) return false;
        if (!columnValid(a, c)) return false;
        if (!firstDiagonalValid(a, r, c)) return false;
        if (!secondDiagonalValid(a, r, c)) return false;
        return true;
    }

    // Check if valid in row
    public static boolean rowValid(int[][] a, int r) {
        int sum = 0;
        for (int j = 0; j < 8; j++) sum += a[r][j];
        if (sum == 1) return true;
        return false;
    }

    // Check if valid in column
    public static boolean columnValid(int[][] a, int c) {
        int sum = 0;
        for (int i = 0; i < 8; i++) sum += a[i][c];
        if (sum == 1) return true;
        return false;
    }

    // Check if valid in first diagonal
    public static boolean firstDiagonalValid(int[][] a, int r, int c) {
        int sum = 0;
        int i = r;
        int j = c;
        while ((i >= 0) && (j >= 0)) {
            sum += a[i][j];
            i--;
            j--;
        }

        if (sum == 1) return true;
        return false;
    }

    // Check if valid in second diagonal
    public static boolean secondDiagonalValid(int[][] a, int r, int c) {
        int sum = 0;
        int i = r;
        int j = c;
        while ((i >= 0) && (j < 8)) {
            sum += a[i][j];
            i--;
            j++;
        }

        if (sum == 1) return true;
        return false;
    }

    // Display the results
    public static void printTable(int[][] a) {
        System.out.println("---------------------------------");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (a[i][j] == 0) {
                    System.out.printf("|   ");
                } else {
                    System.out.printf("| Q ");
                }
            }

            System.out.println("|");
            System.out.println("---------------------------------");
        }
    }
}