/* Program to implement user defined exception handling */
package Unit4;
import java.util.Scanner;
class MyException extends Exception{
    public MyException(String str){
        super(str);
    }
}
public class af {
    static void checkage(int age) throws MyException{
        if(age<18){
            throw new MyException("Age not eligible to vote");
        }else{
            System.out.println("You can vote");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try{
            checkage(age);
        } catch(Exception m){
            System.out.println("Exception occured: "+m);
        }
        sc.close();
    }
}