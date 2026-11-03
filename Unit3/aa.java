/* Program to show single inheritance */
package Unit3; /* Project folder as Package */
class Vehicle {
    void display() {
        System.out.println("This is Vehicle class");
    }
}
class Car extends Vehicle {
    void show() {
        System.out.println("This is Car class");
    }
}
public class aa {
    public static void main(String args[]) {
        Car C = new Car();
        C.display();
        C.show();
    }
}