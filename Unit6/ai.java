/* Implement generic class with single type parameter */
package Unit6;
class Generic1<T> {
    T obj;
    Generic1(T obj) {
        this.obj = obj;
    }
    public T getObj() {
        return this.obj;
    }
}
public class ai {
    public static void main(String[] args) {
        Generic1<Integer> g1 = new Generic1<Integer>(15);
        System.out.println("Integer Value: "+g1.getObj());
        Generic1<String> g2 = new Generic1<String>("Ramesh Adhikari");
        System.out.println("String Value: "+g2.getObj());
    }
}
