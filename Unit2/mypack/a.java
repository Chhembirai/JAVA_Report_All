/* Program to show package types
This is a user defined package */
package mypack;
public class a {
    private int a, b, c;
    public void setData(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void display(){
        int sum = a + b + c;
        System.out.println("Sum: " + sum);
    }
}
