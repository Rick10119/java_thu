public class HW3 {
    /** to test the Exception */
    public static void main(String [] args) {
        double side1, side2, side3;

        // triangle1
        try {
            System.out.println("Creating t1...");
            Triangle t1 = new Triangle(1.5, 1.5, 4);
            System.out.println("t1 created.");
            System.out.println("The are of t1 is: " + t1.getArea());
        }
        catch(IllegalTriangleException ex) {
            System.out.println(ex.toString());
        }

        // triangle2
        try {
            System.out.println("Creating t2...");
            Triangle t2 = new Triangle(2.5, 2.5, 4);
            System.out.println("t2 created.");
            System.out.println("The are of t2 is: " + t2.getArea());
        }
        catch(IllegalTriangleException ex) {
            System.out.println(ex.toString());
        }
    }
}

class IllegalTriangleException extends Exception {
    /** constructor */
    IllegalTriangleException() {
        super("The sides are not legal.");
    }
}
