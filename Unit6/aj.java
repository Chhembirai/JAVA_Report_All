/* Implement generic class with multiple type parameter */
package Unit6;
import java.util.*;
class Generic2<K, V> {
    private HashMap<K, V> map = new HashMap<K, V>();
    public void put(K key, V value) {
        map.put(key, value);
    }
    public V get(K key) {
        return map.get(key);
    }
    public void display() {
        for (K key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
public class aj {
    public static void main(String[] args) {
        Generic2<Integer, String> g2 = new Generic2<Integer, String>();
        g2.put(107, "Hari");
        g2.put(109, "Raj");
        g2.put(106, "Shiva");
        g2.put(120, "Ramesh");
        g2.put(105, "Aman");
        System.out.println("Worker in ID 106: " + g2.get(106));
        System.out.println("Workers List:");
        g2.display();
    }
}