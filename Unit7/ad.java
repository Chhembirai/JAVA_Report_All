/* Lambda expression to add three numbers */
package Unit7;
interface Calculator{
    int add (int x, int y, int z);
}
public class ad {
    public static void main(String[]args){
        Calculator c = (x, y, z) -> x + y + z;
        System.out.println("Addition using Lambda Expression: "+c.add(34, 56, 98));
    }
}
