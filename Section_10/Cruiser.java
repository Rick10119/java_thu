// Example for PPT page No.16

public class Cruiser extends Boat implements Steerable {
    private String arms;
    private String enginType;
    private int direction;

    public Cruiser() {
        super();
    }

    public Cruiser(int buoyancy, String mode, String arms, String enginType) {
        super(buoyancy, mode);
        this.arms = arms;
        this.enginType = enginType;
        this.direction = 0;
    }

    /**
     * implement the method signals in interface Steerable
     */
    public void turnLeft(int degrees) {
        direction -= degrees;
        if (direction < 0) {
            direction += 360;
        }
        System.out.println("The Cruiser turn to the degree:" + direction);
    }

    public void turnRIGHT(int degrees) {
        direction += degrees;
        if (direction > 360) {
            direction -= 360;
        }
        System.out.println("The Cruiser turn to the degree:" + direction);
    }
}