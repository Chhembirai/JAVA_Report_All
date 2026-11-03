/* Program to read and write file using character stream */
package Unit5;
import java.io.*;
public class ab {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Csource.txt");
        String text = "Hello World in Character Stream";
        fw.write(text);
        fw.close();
        System.out.println("Data written successfully.");
        FileReader fr = new FileReader("Csource.txt");
        int i;
        while((i = fr.read()) != -1) {
            System.out.print((char)i);
        }
        fr.close();
    }
}