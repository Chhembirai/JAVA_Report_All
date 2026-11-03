/* Observer pattern */
package Unit7;
import java.util.*;
interface Subscriber{
    void update(String title);
}
class User implements Subscriber{
    String name;
    User(String name){
        this.name = name;
    }
    public void update(String title){
        System.out.println(name + " received notification of "+title);
    }
}
class Ron{
    List<Subscriber> subs = new ArrayList<>();
    void subs(Subscriber s){
        subs.add(s);
    }
    void uploadvideo(String title){
        System.out.println("New Video: "+title);
        for (Subscriber s : subs){
            s.update(title);
        }
    }
}
public class ac {
    public static void main(String []args){
        Ron r = new Ron();
        User u1 = new User("Suraj");
        User u2 = new User("Ramesh");
        User u3 = new User("Garima");
        r.subs(u1);
        r.subs(u2);
        r.subs(u3);
        r.uploadvideo("Java Generics");
    }
}