/* Lambda expression to print message and square of a number */
package Unit7;
interface message{
    void print();
}
interface square{
    void show(int n);
}
public class ae {
    public static void main(String[]args){
        message m = () ->{
            System.out.println("No parameter lambda expression");
        };
        m.print();
        square s = (n) -> {
            System.out.println("One parameter lambda expression");
            System.out.println("Square: "+(n*n));
        };
        s.show(7);
    }
}
