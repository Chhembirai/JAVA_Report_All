/* Method Reference and its types */
package Unit7;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
public class ai 
{
    public static void staticmethod(String name)
    {
        System.out.println("Static Method: "+name);
    }
    public void instancemethod(String name)
    {
        System.out.println("Instance Method: "+name);
    }
    public static void main(String[]args)
    {
        Consumer<String> c1 = ai::staticmethod;
        c1.accept("Triparti");
        ai obj = new ai();
        Consumer<String> c2 = obj::instancemethod;
        c2.accept("Samir");
        System.out.println("Arbitrary Object:");
        List<String>name = Arrays.asList("Ganga", "Ram", "Yogesh");
        name.forEach(System.out::println);
        System.out.println("Reference to Constructor:");
        Supplier<Student> c4 = Student::new;
        Student s = c4.get();
        s.display();
    }
}
class Student
{
    Student()
    {
        System.out.println("Constructor called");
    }
    void display()
    {
        System.out.println("Student Object created");
    }
}