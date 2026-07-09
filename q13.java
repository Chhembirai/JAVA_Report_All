//program to show how for each loop works with user input
import java.util.Scanner;
public class q13 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The numbers you entered are:");
        for (int num : arr) {
            System.out.println(num);
        }
        sc.close();
    }
}