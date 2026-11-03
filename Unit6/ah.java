package Unit6;
/* implement comparator */
import java.util.*;
class entry{
    String name;
    int code;
    entry(String name,int code){
        this.name=name;
        this.code=code;
    }
    public String toString(){
        return code+"=>"+name;
    }
}
public class ah {
    public static void main(String[] args) {
        ArrayList<entry> record = new ArrayList<entry>();
        record.add(new entry("Shampoo", 105));
        record.add(new entry("Soap", 221));
        record.add(new entry("Detergent", 133));
        record.add(new entry("Acid", 42));
        Comparator<entry> bycode = new Comparator<entry>(){
            public int compare(entry e1, entry e2){
                return Integer.compare(e1.code, e2.code) ;
            }
        };
        Collections.sort(record, bycode);
        System.out.println("Sorted by code:");
        for(entry e:record){
            System.out.println(e);
        }
    }   
}