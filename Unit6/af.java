package Unit6;
/* implment treemap */
import java.util.*;
public class af {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<Integer,String>();
        map.put(102,"Rajesh");
        map.put(135,"Haresh");
        map.put(101,"Dale");
        map.put(104,"Raju");
        System.out.println("Tree map:"+map);
        map.remove(102);
        System.out.println("Removing 102:"+map);
        System.out.println("Contains 135:"+map.containsKey(135));
    }    
}
