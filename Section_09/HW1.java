public class HW1 {
    /**
     * to test MyRectangle2D
     */
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println("The area of r1 is: " + r1.getArea());
        System.out.println("The perimeter of r1 is: " + r1.getPerimeter());
        System.out.println("r1 contains (3, 3): " + r1.contains(3, 3));
        System.out.println("r1 contains (new MyRectangle2D(4, 5, 10.5, 3.2)): "
                + r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println("r1 overlaps (new MyRectangle2D(3, 5, 2.3, 5.4)): "
                + r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
    }
}

class MyRectangle2D {
    /**
     * the data fields of MyRectangle2D
     */
    private double x, y, width, height;

    /**
     * the constructors
     */
    MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * get and set method
     */
    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setHeight(double height) {
        this.height = height;
    }

    /**
     * other methods
     */
    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    /**
     * to judge if (x, y) is in this
     */
    boolean contains(double x, double y) {
        if (Math.abs(x - this.x) < width / 2
                && Math.abs(y - this.y) < height / 2) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * to judge if r is in this
     */
    boolean contains(MyRectangle2D r) {
        if (this.contains(r.x + r.width / 2, r.y + r.height / 2)
                && this.contains(r.x - r.width / 2, r.y - r.height / 2)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * to judge if r overlaps this
     */
    boolean overlaps(MyRectangle2D r) {
        if (this.contains(r.x + r.width / 2, r.y + r.height / 2) ||
                this.contains(r.x + r.width / 2, r.y - r.height / 2) ||
                this.contains(r.x - r.width / 2, r.y + r.height / 2) ||
                this.contains(r.x - r.width / 2, r.y - r.height / 2) ||
                r.contains(this.x + this.width / 2, this.y + this.height / 2) ||
                r.contains(this.x + this.width / 2, this.y - this.height / 2) ||
                r.contains(this.x - this.width / 2, this.y + this.height / 2) ||
                r.contains(this.x - this.width / 2, this.y - this.height / 2)) {
            return true;
        } else {
            return false;
        }

    }
}
