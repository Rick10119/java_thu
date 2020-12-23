// Example for PPT page No.16

public class Human implements Steerable {
    String name;
    int age;
    int direction;

    /**
     * default constructor with no name and age is 0, face to north (0)
     */
    public Human() {
        name = "no name";
        age = 0;
        direction = 0;
    }

    public Human(String name, int age, int direction) {
        this.name = name;
        this.age = age;
        this.direction = direction;
    }

    /**
     * implement the methods from Steerable
     */
    public void turnLeft(int degrees) {
        direction -= degrees;
        if (direction < 0) {
            direction += 360;
        }
    }

    public void turnRIGHT(int degrees) {
        direction += degrees;
        if (direction > 360) {
            direction -= 360;
        }
    }
}