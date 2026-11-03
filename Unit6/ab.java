/* implement arraylist */
package Unit6;
import java.util.*;
public class ab {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hari");
        list.add("Raj");
        list.add("Shiva");
        list.add("Ramesh");
        System.out.println("Normal List:\n"+list);
        list.remove("Shiva");
        System.out.println("After removing 1st index:\n"+list);
        System.out.println("Contains Shiva:"+list.contains("Shiva"));
    }
}