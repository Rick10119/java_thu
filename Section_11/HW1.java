import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");

        boolean flag = true;
        int number1 = 0, number2 = 0;

        do {
            try {
                // input
                number1 = input.nextInt();
                number2 = input.nextInt();

                // input success
                flag = false;
            } catch (Exception ex) {
                System.out.println("Input is not right, please input again: ");
                input.nextLine(); // discard input
            }

        } while (flag);


        System.out.println("The sum of the two integers is: " + (number1 + number2));
    }
}
