/* Lambda expression with 3 parameters and for each loop */
package Unit7;
import java.util.ArrayList;
interface multiply{
    int mul(int c, int d, int e);
}
public class af {
    public static void main(String[]args){
        System.out.println("3 Parameters Lambda Expression");
        multiply m = (c, d, e) -> c*d*e;
        System.out.println("Multiplication: "+m.mul(34, 56, 9));
        System.out.println("Lambda expression ForEach");
        ArrayList<String> n = new ArrayList<>();
        n.add("Ram");
        n.add("Haku");
        n.add("Ganga");
        n.forEach(name -> System.out.println(name));
    }
}