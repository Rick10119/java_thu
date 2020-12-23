public class Pentagon extends GeometricObject implements Fillable{

    /** constructor */
    Pentagon() {
        super();
    }
    Pentagon(String color, boolean filled) {
        super(color, filled);
    }
    @Override
    public void howToFill() {
        System.out.println("Put the color in the pentagon");
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
