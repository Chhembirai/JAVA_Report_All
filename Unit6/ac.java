/* implement linkedlist */
package Unit6;
import java.util.*;
public class ac {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addLast("Aaron");
        list.addFirst("Bandu");
        list.add("Chhiring");
        list.add("Dawa");
        System.out.println("Linked list:"+list);
        list.removeFirst();
        System.out.println("Removing first element:"+list);
        System.out.println("Contains Dawa:"+list.contains("Dawa"));
    }    
}
