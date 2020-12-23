public class HW4 {
    /** to test class RegularPolygon */
    public static void main (String [] args) {
        // create
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6, 4);
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // print the perimeter and area of them
        System.out.println("The first instance of RegularPolygon has the perimeter and area of: ");
        System.out.println(rp1.getPerimeter() + " " + rp1.getArea());
        System.out.println("The second instance of RegularPolygon has the perimeter and area of: ");
        System.out.println(rp2.getPerimeter() + " " + rp2.getArea());
        System.out.println("The third instance of RegularPolygon has the perimeter and area of: ");
        System.out.println(rp3.getPerimeter() + " " + rp3.getArea());

    }
}

class RegularPolygon {
    /** the variables */
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    /** the constructors */
    RegularPolygon() {
    }
    RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }
    RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    /** to get and set the variables */
    int getN () {
        return n;
    }
    double getSide () {
        return side;
    }
    double getX () {
        return x;
    }
    double getY () {
        return y;
    }
    void setN(int n) {
        this.n = n;
    }
    void setSide(double side) {
        this.side = side;
    }
    void setX (double x) {
        this.x = x;
    }
    void setY (double y) {
        this.y = y;
    }

    /** to get the perimeter of this */
    double getPerimeter () {
        return n * side;
    }

    /** to get the area of the thing */
    double getArea () {
        return (n*side*side)/(4*Math.tan(Math.PI/n));
    }

}

