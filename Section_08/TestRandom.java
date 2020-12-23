// Example for PPT page No.29

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        int seed1 = Integer.parseInt(args[0]);

        // Create random object with first seed
        Random random1 = new Random(seed1);

        // Display the first 10 random numbers in random1
        for (int i = 0; i < 10; i++) {
            System.out.printf("%4d", random1.nextInt(1000));
        }
        System.out.println();

        // Create another random object with second seed
        Random random2 = new Random(Integer.parseInt(args[1]));

        // Display the first 10 random numbers in random2
        for (int i = 0; i < 10; i++) {
            System.out.printf("%4d", random2.nextInt(1000));
        }
        System.out.println();

        System.out.println("--------");

        // Create random object in with default random seed
        Random random3 = new Random();

        // Display the first 10 random numbers in random3
        for (int i = 0; i < 10; i++) {
            System.out.printf("%4d", random3.nextInt(1000));
        }
        System.out.println();

        // Create random object in with default random seed
        Random random4 = new Random();

        // Display the first 10 random numbers in random4
        for (int i = 0; i < 10; i++) {
            System.out.printf("%4d", random4.nextInt(1000));
        }
        System.out.println();

    }
}