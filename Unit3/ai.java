/* Show concept of Final keyword */
package Unit3;
final class Worker{
    final int id = 115; 
    final void message() {
        System.out.println("Final message to " + id);
    }
}
public class ai {
    public static void main(String args[]) {
        Worker w = new Worker();
        System.out.println("Final variable: " + w.id);
        w.message();
    }
}
