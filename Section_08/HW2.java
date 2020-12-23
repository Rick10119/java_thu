import java.util.Scanner;

public class HW2 {
    /** to test */
    public static void main (String [] args) {

        // define a scanner
        Scanner input = new Scanner(System.in);

        // input
        System.out.println("Please input a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // create the class
        QuadraticEquation myQE = new QuadraticEquation(a, b, c);

        // print the Discriminant
        System.out.println("The Discriminant is: " + myQE.getDiscriminant());

        // print the root:
        if (myQE.getDiscriminant() > 0) {
            // two roots
            System.out.println("The roots are: "
                    + myQE.getRoot1() + " and " + myQE.getRoot2());
        } else if (myQE.getDiscriminant() < 0) {
            // no roots
            System.out.println("The equation has no roots.");
        } else {
            // one root
            System.out.println("The equation has one root: " + myQE.getRoot1());
        }
    }

}

class QuadraticEquation {
    /**
     * properties of the class
     */
    // default is 0
    private double a = 0, b = 0, c = 0;

    /**
     * constructors of the class
     */
    QuadraticEquation() {

    }

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * methods of the class
     */
    // to get a, b, c
    double getA() {
        return this.a;
    }

    double getB() {
        return this.b;
    }

    double getC() {
        return this.c;
    }

    // to get the Discriminant
    double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    /** get the roots of the equation */
    double getRoot1() {
        if (this.getDiscriminant() < 0) {
            return 0;
        } else {
            return (-b + Math.sqrt(this.getDiscriminant())) / (2 * a);
        }
    }

    double getRoot2() {
        if (this.getDiscriminant() < 0) {
            return 0;
        } else {
            return (-b - Math.sqrt(this.getDiscriminant())) / (2 * a);
        }
    }
}
