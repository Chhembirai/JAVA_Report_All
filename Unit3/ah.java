/* Show concept of Object class */
package Unit3;
class Student{
    String name = "Ranjeet";
    int id = 117;
    @Override
    public String toString() {
        return "Id: " + id + ", Name: " + name;
    }
}
public class ah {
    public static void main(String args[]) {
        Student s = new Student();
        System.out.println(s);
        System.out.println(s.getClass());
        System.out.println(s.hashCode());
    }
}
