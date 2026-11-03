/* implement hashmap */
package Unit6;
import java.util.*;
public class ae {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Aarati");
        map.put(2,"Bishal");
        map.put(3,"Chhiring");
        map.put(4,"Raman");
        System.out.println("Hash map:"+map);
        map.remove(1);
        System.out.println("Removing 1:"+map);
        System.out.println("Contains 2:"+map.containsKey(2));
    }
}
