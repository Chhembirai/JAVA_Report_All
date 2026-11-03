/*Program to show serialization */
package Unit5;
import java.io.*;
class Hospital implements Serializable {
    String name;
    int age;
    Hospital(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class ae{
    public static void main(String args[])throws IOException, ClassNotFoundException{
        Hospital h = new Hospital("John", 25);
        FileOutputStream fos = new FileOutputStream("Serialized.txt");
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(h);
        out.close();
        System.out.println("Object serialized successfully.");
    }
}