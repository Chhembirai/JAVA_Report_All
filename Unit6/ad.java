/* implement hashset */
package Unit6;
import java.util.*;
public class ad {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Ashma");
        set.add("Bire");
        set.add("Ramesh");
        set.add("Dhanraj");
        System.out.println("Hash set:"+set);
        set.remove("Ashma");
        System.out.println("Removing Ashma:"+set);
        System.out.println("Contains Bire:"+set.contains("Bire"));
    }
}
