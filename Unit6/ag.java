package Unit6;
/* implement iterator*/
import java.util.*;
public class ag {
    public static void main(String[] args) {
        ArrayList<String> record = new ArrayList<String>();
        record.add("Arjun");
        record.add("Suraj");
        record.add("Chameli");
        record.add("Raju");
        Iterator<String> it = record.iterator();
        System.out.println("List:");
        while(it.hasNext()){
            String name = it.next();
            System.out.println(name);
        }
        it = record.iterator();
        while(it.hasNext()){
            String name = it.next();
            if(name.equals("Chameli")){
                it.remove();
            }
        }
        System.out.println("After removing:");
        it = record.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
