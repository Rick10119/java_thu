import java.util.Scanner;

/**
 * to return the max number of the input array
 */
public class HW1 {
    public static void main(String[] args) {
        // Declare and create the input object
        Scanner input = new Scanner(System.in);

        // input the int array
        System.out.println("please input the length of the array: ");
        int lengthOfArray = input.nextInt();
        int[] inputArray = new int[lengthOfArray];

        System.out.println("please input the elements: ");
        for (int i = 0; i < lengthOfArray; i++) {
            inputArray[i] = input.nextInt();
        }

        // to find the max
        System.out.println("the max element of the array is: \n"
                + maxOfArray(inputArray));
    }

    /**
     * to return the max number of the input array
     */
    public static int maxOfArray(int[] inputArray) {
        // basic problem, if there is only one element
        if (inputArray.length == 0) {
            return 0;
        } else if (inputArray.length == 1) {
            return inputArray[0];
        }

        // iterative
        // create a new array, which is shorter, drop the lase element
        if (inputArray[0] < inputArray[inputArray.length - 1]) {
            inputArray[0] = inputArray[inputArray.length - 1];
        }

        int [] lastArray = new int [inputArray.length - 1];
//        for (int i = 0;i < lastArray.length;i ++) {
//            lastArray[i] = inputArray[i];
//        }
        System.arraycopy(inputArray, 0, lastArray,0,inputArray.length-1);

        // Recursive calling
        return maxOfArray(lastArray);

    }
}
