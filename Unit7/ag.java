/* Stream API for sorting, searching, counting, filtering a group of names */
package Unit7;
import java.util.*;
public class ag {
    public static void main(String[]args){
        ArrayList<String> name = new ArrayList<>();
        name.add("Ganesh");
        name.add("Karki");
        name.add("Pukar");
        name.add("Narayan");
        name.add("Ramesh");
        System.out.println("Sorting...");
        name.stream().sorted().forEach(System.out::println);
        System.out.println("Searching...");
        name.stream().filter(n->n.startsWith("R"))
        .forEach(n->System.out.println("Found: "+n));
        System.out.println("Counting...");
        long count = name.stream().count();
        System.out.println("Total names: "+count);
        System.out.println("Filtering...");
        name.stream().filter(n->n.startsWith("P")).forEach(System.out::println);
    }
}
