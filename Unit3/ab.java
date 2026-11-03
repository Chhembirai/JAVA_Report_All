/* Program to show multilevel inheritance */
package Unit3;
class vehicl {
    void display() {
        System.out.println("This is Vehicle class");
    }
}
class carz extends vehicl {
    void show() {
        System.out.println("This is Car class");
    }
}
class Toyota extends carz {
    void see() {
        System.out.println("This is Toyota class");
    }
}
public class ab {
    public static void main(String args[]) {
        Toyota T = new Toyota();
        T.display();
        T.show();
        T.see();
    }
}