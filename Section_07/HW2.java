import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW2 {
    /**
     *  sudoku problem
      */
    public static void main(String[] args) throws FileNotFoundException {
        // Declare and create the input object
        //Scanner input = new Scanner(new File("Data1.txt"));
        Scanner input = new Scanner(System.in);

        // input the int [9][9] sudoku form
        System.out.println("please input the sudoku form(9*9): ");
        int[][] sudoku = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = input.nextInt();
            }
        }

        // to complete the form
        int[][] sudokuCompleted = MyActions.complete(sudoku);

        // print the competed form
        System.out.println("The completed sudoku form is: \n");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudokuCompleted[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static class MyActions {
        public static int[][] sudokuCompleted;

        /**
         * to complete the form
         *
         * @param sudoku
         * @return sudokuCompleted
         */
        public static int[][] complete(int[][] sudoku) {
            // copy from the input
            sudokuCompleted = copyOfArray2(sudoku);

            // to count the number of zeros
            int[] zeroJudge = countZeros(sudokuCompleted);

            // if zeros = 0, complete
            if (zeroJudge[0] == 0) {
                return sudokuCompleted;
            }

            // if there are zeros, fill in the last zero with an available number (loop)
            int x = zeroJudge[1], y = zeroJudge[2];// position of the last zero
            // find the possible numbers at (x, y)
            int[] availableNumbers = findAvailableNumbers(x, y, sudokuCompleted);
            // actually available?
            if (!actuallyAvailable(availableNumbers, x, y, sudokuCompleted)) {
                System.out.println("We have not found an answer for this sudoku:");
            }
            return sudokuCompleted;
        }

        /**
         * to see if tryNumber is actually available
         * fill it in and see next zero
         */
        public static boolean actuallyAvailable(int[] availableNumbers, int x, int y, int[][] sudoku) {

            // actually not found
            if (availableNumbers[0] == 0) {
                // not good, cannot found, back to last level
                return false;
            }

            // found for this level, how about next?
            for (int i = 0; availableNumbers[i] > 0; i++) {
                // copy
                int [][] sudokuNext = copyOfArray2(sudoku);
                // fill in one to try
                sudokuNext[x][y] = availableNumbers[i];
                // to count the zeros of next sudoku form
                int[] zeroJudge = countZeros(sudokuNext);

                if (zeroJudge[0] == 0) {
                    // good, no more zeros, complete
                    sudokuCompleted[x][y] = availableNumbers[i];
                    return true;
                } else {
                    // there are still zeros, fill the next zero
                    // position of the last zero
                    int xNext = zeroJudge[1], yNext = zeroJudge[2];
                    // available numbers to fill
                    int[] availableNumbersNext = findAvailableNumbers(xNext, yNext, sudokuNext);

                    // call recursion
                    if(!actuallyAvailable(availableNumbersNext, xNext, yNext, sudokuNext)) {
                        // this i is not right
                        continue;
                    } else {
                        // the right i is found, fill it in
                        sudokuCompleted[x][y] = availableNumbers[i];
                        return true;
                    }
                }
            }

        return false;
        }

        /**
         * to find the available numbers for a sudoku form, at (x, y)
         * the ith element [i - 1] is 1 for the number has appeared
         */
        public static int[] findAvailableNumbers(int x, int y, int[][] sudoku) {
            // define int arrays to store the index of numbers not available
            int[] indexOfNumbers = new int[9];
            int[] availableNumbers = new int[9];

            // loop the x th raw
            for (int j = 0; j < 9; j++) {
                // mark the appearance of the element
                if (sudoku[x][j] != 0) {
                    indexOfNumbers[sudoku[x][j] - 1] = 1;
                }
            }

            // loop the y th raw
            for (int i = 0; i < 9; i++) {
                // mark the appearance of the element
                if (sudoku[i][y] != 0) {
                    indexOfNumbers[sudoku[i][y] - 1] = 1;
                }
            }

            // loop the square (X, Y)
            int X = x / 3 + 1, Y = y / 3 + 1;
            for (int i = (X - 1) * 3; i < X * 3; i++) {
                for (int j = (Y - 1) * 3; j < Y * 3; j++) {
                    if (sudoku[i][j] != 0) {
                        indexOfNumbers[sudoku[i][j] - 1] = 1;
                    }
                }
            }

            int count = 0;
            for (int k = 0; k < 9; k++) {
                if (indexOfNumbers[k] == 0) {
                    availableNumbers[count] = k + 1;
                    count++;
                }
            }

            return availableNumbers;
        }

        /**
         * to count the zeros in the form
         * return number of zeros and
         * the position of the position of the last zero(x, y)
         * if no zeros, x = y = 0
         */
        public static int[] countZeros(int[][] sudoku) {
            int[] count = new int[3];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (sudoku[i][j] == 0) {
                        count[0]++;
                        count[1] = i;
                        count[2] = j;
                    }
                }
            }
            return count;
        }

        /**
         * to copy a two dimentional array from former to later
         * @param former
         * @return
         */
        public static int[][] copyOfArray2 (int [][] former) {
            int [][] later = new int [former.length][former[0].length];
            for (int i = 0;i < former.length;i ++) {
                for (int j = 0;j < former[0].length;j ++) {
                    later[i][j] = former[i][j];
                }
            }
            return later;
        }
    }
}
