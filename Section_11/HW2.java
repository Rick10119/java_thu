public class HW2 {
    public static void main(String [] args) {

        String string1 = "sdj";
        String string2 = "1111";

        System.out.println("The hexadecimal format of string1 is: ");
        System.out.println(binaryToHexadecimal(string1));

        System.out.println("The hexadecimal format of string2 is: ");
        System.out.println(binaryToHexadecimal(string2));


    }

    public static String binaryToHexadecimal(String binaryString) {
        // to judge the string is bin or not
        try {
            for(int i = 0;i < binaryString.length();i ++) {
                // is not only 1 and 0
                if(binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
                    throw new BinaryFormatException(binaryString);
                }
            }
        }
        // format not right, return itself
        catch(BinaryFormatException ex){
            System.out.println(ex.toString());
            System.out.println("The original string1 will be returned.");
            return binaryString;
        }

        String hexString = Long.toHexString(Long.parseLong(binaryString, 2));
        return hexString;

    }
}

class BinaryFormatException extends Exception {
    /** constructor */
    BinaryFormatException() {
        super("The format is not binary!");
    }

    BinaryFormatException(String s) {
        super("The format of this string: " + s + " is not binary!");
    }


}
