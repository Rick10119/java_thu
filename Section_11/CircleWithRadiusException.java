// Example for PPT page No.

public class CircleWithRadiusException {
    /**
     * The radius of the circle
     */
    private double radius;

    /**
     * The number of the objects created
     */
    private static int numberOfObjects = 0;

    /**
     * Default constructor, construct a circle with radius 1
     */
    public CircleWithRadiusException() throws InvalidRadiusException {
        this(1.0);
    }

    /**
     * Construct a circle with a specified radius
     */
    public CircleWithRadiusException(double radius) throws InvalidRadiusException {
        try {
            setRadius(radius);
            numberOfObjects++;
        } catch (InvalidRadiusException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set a new radius
     */
    public void setRadius(double radius) throws InvalidRadiusException {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new InvalidRadiusException(radius);
        }
    }

    /**
     * Return numberOfObjects
     */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Return the area of the circle
     */
    public double findArea() {
        return radius * radius * Math.PI;
    }
}