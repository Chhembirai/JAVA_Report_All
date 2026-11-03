/* Program using character stream to copy the content of one file to another */
package Unit5;
import java.io.*;
public class ac {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Csource.txt");
            FileWriter fw = new FileWriter("Cdestination.txt");
            int i;
            while((i = fr.read()) != -1) {
                fw.write((char)i);
            }
            fr.close();
            fw.close();
            System.out.println("Data copied successfully.");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}