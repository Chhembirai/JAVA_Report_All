/* Implement generic hierarchy with generic class with generic child class */
package Unit6;
class parent2<T>{
    protected T data;
    public void set(T data) {
        this.data = data;
    }
    public T get() {
        return data;
    }
}
class childern1<T> extends parent<T> {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Number: " + get());
        System.out.println("Name: " + name);
    }
}
public class ao {
    public static void main(String[] args) {
        childern1<Integer> c1 = new childern1<>();
        System.out.println("With Integer:");
        c1.set(112);
        c1.setName("Roman");
        c1.display();
        childern1<String> c2 = new childern1<>();
        System.out.println("With String:");
        c2.set("Roman");
        c2.setName("Rajan");
        c2.display();
    }
}
