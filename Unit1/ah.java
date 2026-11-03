package Unit1;
//program to find area and circumference of a circle using functions
import java.util.Scanner;
public class ah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        double area = cArea(r);
        double circum = cCircumference(r);
        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circum);
        sc.close();
    }
    public static double cArea(double radius) {
        return Math.PI * radius * radius;
    }
    public static double cCircumference(double radius) {        
        return 2 * Math.PI * radius;
    }
}