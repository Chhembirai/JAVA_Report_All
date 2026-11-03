/* Program to append deserializability in d5*/
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
public class af {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
       FileInputStream fis = new FileInputStream("Serialized.txt");
       ObjectInputStream in = new ObjectInputStream(fis);
       Hospital h = (Hospital) in.readObject();
       in.close();
       fis.close();
       System.out.println("Patient name: " + h.name);
       System.out.println("Patient age: " + h.age);
       System.out.println("Object deserialized successfully.");
    }
}