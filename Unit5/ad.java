/* Program to append text/ line using character stream */
package Unit5;
import java.io.*;
public class ad {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt", true);
            fw.write("This is the appended line.");
            fw.close();
            System.out.println("Text appended successfully.");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}