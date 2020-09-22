import java.util.Scanner;
import java.lang.Math;
public class HW4 {
    public static void main(String[] args) {
        // temperature indoors, felt, the velocity of wind
        double t_a = 0, t_wc = 0, vel = 0;

        // input the t_a
        System.out.println("请输入温度（-58~41华氏度，回车结束）");
        Scanner scan_t_a = new Scanner(System.in);
        t_a = scan_t_a.nextDouble();

        // input the velocity
        System.out.println("请输入风速（>2mph，回车结束)");
        Scanner scan_vel = new Scanner(System.in);
        vel = scan_vel.nextDouble();

        // to judge weather the temperature and velocity and suitable or not
        if (t_a < -58 || t_a > 41 || vel < 2) {
            System.out.println("Sorry, 您输入的温度或风速不适合计算风寒温度");
        } else {
            // suitable, calculate and output
            t_wc = 35.74 + 0.6215 * t_a - 35.75 * Math.pow(vel, 0.16) + 0.4275 * t_a * Math.pow(vel, 0.16);
            System.out.printf( "风寒温度为%7.3f华氏度", t_wc);
        }
    }
}
