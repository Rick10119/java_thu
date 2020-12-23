import java.util.Scanner;

public class HW2 {
    public static void main (String [] args) {
        // define the Scanner
        Scanner input=new Scanner(System.in);

        // input
        System.out.println("please input your password:");
        String password = input.nextLine();

        // judge
        boolean judge = true;
        // to count for number of ints and letters
        int numNumbers = 0;
        int letterNumbers = 0;

        // has at least 8 chars
        if (password.length() < 8) {
            judge = false;
        }

        // content
        for (int i = 0;i < password.length();i ++) {
            char ithChar = password.charAt(i);
            if(Character.isDigit(ithChar)) {
                // input number
                numNumbers += 1;
            } else if (Character.isLetter(ithChar)) {
                // input letter
                letterNumbers += 1;
            }
        }

        // judge content
        // less than a numbers or have other types than int and letter
        if (numNumbers + letterNumbers != password.length() || numNumbers < 2) {
            judge = false;
        }

        // print
        if(judge) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
