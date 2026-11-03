/* Show hierarchial inheritance */
package Unit3;
class vehhi {
    void display() {
        System.out.println("This is Vehicle class");
    }
}
class care extends vehhi {
    void display() {
        System.out.println("This is Car class");
    }
}
class Bike extends vehhi {
    void display() {
        System.out.println("This is Bike class");
    }
}
public class ad {
    public static void main(String args[]) {
        care C = new care();
        Bike B = new Bike();
        C.display();
        B.display();
    }
}
