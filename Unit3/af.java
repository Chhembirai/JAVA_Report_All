/* Show concept of overloading polymorphism */
package Unit3;
class Calculator{
    void add(int a, int b){
        System.out.println("Sum: " + (a+b));
    }
    void add(float a, float b){
        System.out.println("Sum: " + (a+b));
    }
    void add(int a, float b){
        System.out.println("Sum: " + (a+b));
    }
    void add(float a, int b, double c){
        System.out.println("Sum: " + (a+b+c));
    }
}
public class af {
    public static void main(String args[]) {
        Calculator c = new Calculator();
        c.add(5, 10);
        c.add(7.52f, 9.512f);
        c.add(5, 10.534f);
        c.add(6.556f, 10, 15.512);
    }
}