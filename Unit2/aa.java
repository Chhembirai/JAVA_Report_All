/* Program to find area of rectangle using OOP concept */

import java.util.Scanner;
class Rectangle {
    int length, breadth;
    void setvalue(int l, int b) {
        length = l;
        breadth = b;
    }
    /* Display area */
    void display(){
        int area = length * breadth;
        System.out.println("Area of rectangle:" + area);
    }
}

public class aa {
    public static void main(String[] args) {
        /*Create a Rectangle object*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length:");
        int l = sc.nextInt();
        System.out.print("Enter breadth:");
        int b = sc.nextInt();
        Rectangle r = new Rectangle();
        r.setvalue(l, b);
        r.display();
        sc.close();
    }
}