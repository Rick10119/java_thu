public class HW2 {
    /**
     * to test Triangle
     */
    public static void main(String[] args) {

        // create
        Triangle t1 = new Triangle(1.2, 1.5, 1);
        t1.setColor("yellow");
        t1.setFilled(true);

        // print
        System.out.println("The area of t1 is: " + t1.getArea());
        System.out.println("The perimeter of t1 is: " + t1.getPerimeter());
        System.out.println("The color of t1 is: " + t1.getColor());
        System.out.println("The filled of t1 is: " + t1.isFilled());
        System.out.println("The toString of t1 is: " + t1.toString());
    }
}

class Triangle extends GeometricObject {
    /**
     * data field of this Triangle
     */
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    /**
     * the constructors
     */
    public Triangle() {
        super();
    }

    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * get the sides
     */
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    /**
     * get the area and perimeter
     */
    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /**
     * toString to override
     */
    public String toString() {
        return "Triangle: side1= " + side1 + " side2= " + side2 + " side3= " + side3;
    }
}
