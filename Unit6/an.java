/* Implement generic hierarchy with generic class with non generic child class */
package Unit6;
class parent<T>{
    private T data;
    public void set(T data) {
        this.data = data;
    }
    public T get() {
        return data;
    }
}
class child1 extends parent<Integer> {
    public void display() {
        System.out.println("Roll No.: " + get());
    }
}
class child2 extends parent<String> {
    public void display() {
        System.out.println("Name: " + get());
    }
}
public class an {
    public static void main(String[] args) {
        child1 c1 = new child1();
        child2 c2 = new child2();
        c1.set(101);
        c2.set("Rajan");
        c1.display();
        c2.display();
    }
}
