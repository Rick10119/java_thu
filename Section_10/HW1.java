public class HW1 {
    /** to test Pentagon */
    public static void main(String [] args) {

        // create the array
        GeometricObject[] go = new GeometricObject[5];
        go[0] = new Pentagon();
        go[1] = new Pentagon("red", false);
        go[2] = new Pentagon("blue", true);
        go[3] = new Circle();
        go[4] = new Rectangle();

        // to print
        for(GeometricObject goTemp : go) {
          
            System.out.println(goTemp.toString());

            if(goTemp.ifFilled()) {
                ((Pentagon)goTemp).howToFill();
            }
            
            System.out.println();
        }
    }
}
