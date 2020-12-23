import java.util.Arrays;

/** to sort a String */
public class HW3 {
    public static void main(String [] args) {
        System.out.println(sort(args[0]));
    }

    public static String sort(String s) {

        // convert into char[]
        char [] sToChar = s.toCharArray();

        // sort using Array.sort();
        Arrays.sort(sToChar);

        // from char[] to String
        String sSorted = new String(sToChar);

        return sSorted;
    }
}
