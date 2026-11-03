/* Program to implement encapsulation in OOP */
import java.util.Scanner;
class Palindrome{
    private int num;
    /* Take input */
    public void setdata(int n){
        this.num = n;
    }
    /* Check palindrome */
    public void checkpal(){
        int temp = num, rev = 0, rem;
        while(temp!=0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp/10;
        }
        if(rev == num){
            System.out.println("Palindrome.");
        }else{
            System.out.println("Not a palindrome.");
        }
    }
}

public class ad {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        Palindrome p = new Palindrome();
        p.setdata(n);
        p.checkpal();
        sc.close();       
    }
}