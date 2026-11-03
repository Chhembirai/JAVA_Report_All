package Unit1;
//program to implement while and do while loop
import java.util.Scanner;
public class am {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.println("Using while loop:");
        int i = number;
        while (i < 0) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("Using do-while loop:");
        i = number;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 0);
        System.out.println("\n");
        sc.close();
    }
}