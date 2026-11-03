/* Program to implement recursion */
import java.util.Scanner;
class Recursion{
    int num;
    /* Input */
    void setdata(int n){
        num = n;
    }
    int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * factorial (n - 1);
        }
    }
    void display(){
        int result = factorial(num);
        System.out.println("Factorial: " + result);
    }
}
public class ah {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        Recursion obj = new Recursion();
        obj.setdata(n);
        obj.display();
        sc.close();
    }
}