// Example for PPT page No.35

public class Casting {
    public static void main(String[] args) {
        // Declare and initialize two objects
        Object object1 = new Circle(3);
        Object object2 = new Rectangle(2, 4);
        Object object3 = new A();

        // Display circle and rectangle
        displayObject(object1);
        displayObject(object2);
        displayObject(object3);
    }

    /**
     * Display object method
     */
    public static void displayObject(Object object) {
        System.out.println("==========");
        System.out.println(object.toString());
        System.out.println("-----");

        if (object instanceof Circle) {
            System.out.println("The circle area is " + ((Circle) object).getArea());
            System.out.println("The circle diameter is " + ((Circle) object).getDiameter());
        } else if (object instanceof Rectangle) {
            System.out.println("The rectangle area is " + ((Rectangle) object).getArea());
        }

        System.out.println();
    }
}