/* Program to find prime or not in OOP concept */

import java.util.Scanner;
class Prime{
    int num;
    public void setdata(int n){
        this.num = n;
    }
    public void checkprime(){
        int count = 0;
        for (int i= 1; i<=num; i++){
            if (num % i == 0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Number is Prime.");
        } else {
            System.out.println("Number is not Prime.");
        }
    }
}
public class ac {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        Prime p = new Prime();
        p.setdata(n);
        p.checkprime();
        sc.close();
    }
}