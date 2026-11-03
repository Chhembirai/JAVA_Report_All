/* Show concept of interface */
package Unit3;
interface Engine{
    void sound();
    void fuel();
}
interface Wheel{
    void rim();
    void tyre();
}
class Carr implements Engine, Wheel{
    public void sound() {
        System.out.println("Car starts if engine makes sound");
    }
    public void fuel() {
        System.out.println("Car engine uses petrol");
    }
    public void rim() {
        System.out.println("Car has 4 rims");
    }
    public void tyre() {
        System.out.println("Car has 4 tyres");
    }
}
public class al {
    public static void main(String args[]) {
        Carr c = new Carr();
        c.sound();
        c.fuel();
        c.rim();
        c.tyre();
    }
}