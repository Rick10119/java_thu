public class HW2 {
    /** to calculate the sum of 1+2+...+9 */
    public static void main (String[] args) {
        int sum = 0;
        // initialize the sum

        for(int i = 1;i <= 9;i = i+1) {
            // add from 1 to 9
            sum = sum + i;
        }

        System.out.println(sum);
        // to print the sum
    }
}
