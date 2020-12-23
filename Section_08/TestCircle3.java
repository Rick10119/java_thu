// Example for PPT page No.26

public class TestCircle3 {
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Create a circle with radius 5.0 - myCircleA
        Circle3 myCircleA = new Circle3(5.0);
        System.out.println("The area of the circle of radius " + myCircleA.getRadius() + " is " + myCircleA.getArea());

        // Increase myCircleA's radius by 10%
        myCircleA.setRadius(myCircleA.getRadius() * 1.1);
        System.out.println("The area of the circle of radius " + myCircleA.getRadius() + " is " + myCircleA.getArea());

        // Create a circle with default radius - myCircleB
        Circle3 myCircleB = new Circle3();
        System.out.println("The area of the circle of radius " + myCircleB.getRadius() + " is " + myCircleB.getArea());

        // Display the number of circle object created from Class
        System.out.println("We have created " + Circle3.getNumberOfObjects() + " circle objects.");

        // Display the number of circle object created from object
        System.out.println("We have created " + myCircleA.getNumberOfObjects() + " circle objects.");
    }
}