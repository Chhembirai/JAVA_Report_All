/* Show Super keyword in variable, method and constructor */
package Unit3;
class Vehi {
    String name = "Vehicle";
    Vehi() {
        System.out.println("Vehicle constructor");
    }
    void display() {
        System.out.println("This is Vehicle class");
    }
}
class Ca extends Vehi {
    String name = "Car";
    Ca() {
        super();
        System.out.println("Car constructor");
    }
    void display() {
        System.out.println("This is Car class");
    }
    void show() {
        System.out.println("Main class: " + super.name);
        super.display();
        display();
    }
}
public class ae {
    public static void main(String args[]) {
        Ca C = new Ca();
        C.display();
        C.show();
    }
}