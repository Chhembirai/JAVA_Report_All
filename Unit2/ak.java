/* This is the package user in file a12 */
import mypack.a;
import java.util.Scanner;
public class ak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        a s = new a();
        s.setData(x, y, z);
        s.display();
        sc.close();
    }
}
