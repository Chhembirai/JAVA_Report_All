/* Implement generic interfaces */
package Unit6;
interface data<K, V>{
    K key();
    V value();
}
class employee implements data<Integer, String> {
    private Integer id;
    private String name;
    public employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Integer key() {
        return id;
    }
    public String value() {
        return name;
    }
    void display() {
        System.out.println("Employee ID: " + key() + "\nName: " + value());
    }
}
public class am {
    public static void main(String[] args) {
        employee e1 = new employee(101, "Rajan");
        employee e2 = new employee(102, "Sita");
        e1.display();
        e2.display();
    }
}