/* Show multiple inheritance */
package Unit3;
interface vehi {
    void display();
}
interface carr {
    void show();
}
class BMW implements vehi, carr {
    public void display() {
        System.out.println("This is Vehicle class");
    }
    public void show() {
        System.out.println("This is Car class");
    }
}
public class ac {
    public static void main(String args[]) {
        BMW B = new BMW();
        B.display();
        B.show();
    }
}
