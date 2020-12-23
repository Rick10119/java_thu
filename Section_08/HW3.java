public class HW3 {
    /** to test the class Fan */
    public static void main (String [] args) {
        // create
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        // set
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        // print
        System.out.println("The first instance of Fan: ");
        System.out.println(fan1.toString());
        System.out.println("The second instance of Fan: ");
        System.out.println(fan2.toString());
    }
}

class Fan {
    /** the variables */
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";

    /** constructor */
    Fan () {
    }

    /** to get and set the variables */
    int getSpeed () {
        return speed;
    }
    boolean getOn () {
        return on;
    }
    double getRadius () {
        return radius;
    }
    String getColor () {
        return new String(color);
    }
    void setSpeed(int speed) {
        this.speed = speed;
    }
    void setOn(boolean on) {
        this.on = on;
    }
    void setRadius (double radius) {
        this.radius = radius;
    }
    void setColor (String color) {
        this.color = new String(color);
    }

    /** to see the property of this Fan */
    public String toString () {
        if (this.on) {
            return "speed: " + this.speed
                    + "\ncolor: " + this.color
                    + "\nradius: " + this.radius;
        } else {
            return "fan is off" +
                    "\ncolor: " + this.color
                    + "\nradius: " + this.radius;
        }
    }
}
