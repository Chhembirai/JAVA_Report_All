package Unit1;
//Program to show use of scanner in different ways
import java.util.Scanner;
public class ae {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word, integer, double, float, boolean:");
        String wrd = sc.nextLine();
        int itg = sc.nextInt();
        double dbl = sc.nextDouble();
        float flt = sc.nextFloat();
        boolean bol = sc.nextBoolean();
        System.out.println("Word: " + wrd);
        System.out.println("Integer: " + itg);
        System.out.println("Double: " + dbl);
        System.out.println("Float: " + flt);
        System.out.println("Boolean: " + bol);
        sc.close();
    }
}
