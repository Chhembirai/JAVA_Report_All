/* Implement generic method in generic class */
package Unit6;
class generic3<T>{
    public <E> void show(E obj1){
        System.out.println("Value : " + obj1);
    }
}
public class ak {
    public static void main(String[] args) {
        generic3<Integer> g1 = new generic3<Integer>();
        g1.show(116);
        generic3<String> g2 = new generic3<String>();
        g2.show("Hello World in Generic Method");
        generic3<Float> g3 = new generic3<Float>();
        g3.show(3.14f);
    }
}
