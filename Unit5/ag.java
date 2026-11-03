/* Program to show random access file */
package Unit5;
import java.io.*;
public class ag {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("source1.txt", "rw");
            file.seek(file.length());
            file.writeBytes("My Mid Term Marks is 26.");
            file.seek(0);
            System.out.println("File content is: "+file.readLine());
            file.close();
            System.out.println("Data is written successfully.");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}