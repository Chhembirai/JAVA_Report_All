/* Show concept of overriding polymorphism */
package Unit3;
class vehicles{
    void engine(){
        System.out.println("Engine makes vehicle move");
    }
}
class cars extends vehicles{
    @Override
    void engine(){
        System.out.println("Car engine makes car move");
    }
}
public class ag {
    public static void main(String args[]) {
        cars c = new cars();
        c.engine();
    }
}
