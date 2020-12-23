import java.util.Scanner;
/** to calculate the max round distance of (x1, y1) and (x2, y2) */
public class HW1 {

    public static void main (String [] args) {

        // define the Scanner
        Scanner input=new Scanner(System.in);
        // define the position of the two
        double x1, x2, y1, y2;
        // the radius of the earth, 6371.1km
        double radius = 6371.01;

        // input
        System.out.println("请输入：地点1： 纬度 经度 （南半球纬度、东半球经度为负）");
        y1 = Math.toRadians(input.nextDouble());
        x1 = Math.toRadians(input.nextDouble());

        System.out.println("请输入：地点1： 纬度 经度 （南半球纬度、东半球经度为负）");
        y2 = Math.toRadians(input.nextDouble());
        x2 = Math.toRadians(input.nextDouble());

        // to calculate the distance d
        double d = radius * Math.acos(Math.sin(x1)*Math.sin(x2) +
                Math.cos(x1)*Math.cos(x2)*Math.cos(y1 - y2));

        // print
        System.out.printf("The distance between them is %6.2f km", d);
    }
}
