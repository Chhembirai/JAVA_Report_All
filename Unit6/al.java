/* Implement wildcard arguments with single and multiple type parameter */
package Unit6;
class Box<T> {
    private T data;
    public Box(T data) {
        this.data = data;
    }
    public T get() {
        return data;
    }
}
public class al {
    static void display(Box<?> box) {
        System.out.println("Box contains: " + box.get());
    }
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>(123);
        display(box1);
        Box<String> box2 = new Box<>("Hello World in Wildcard");
        display(box2);
        Box <Double> box3 = new Box<>(45.67);
        display(box3);
    }
}
