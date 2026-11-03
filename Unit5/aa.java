/* Program to read and write file using bytestream */
package Unit5;
import java.io.*;
public class aa 
{
    public static void main(String[] args) throws IOException 
    {
        FileOutputStream fos = new FileOutputStream("source.txt");
        String text = "Hello World in Byte Stream";
        byte[]data = text.getBytes();
        fos.write(data);
        fos.close();
        System.out.println("Data written successfully.");
        FileInputStream fis = new FileInputStream("source.txt");
        int i;
        while((i = fis.read()) != -1) 
        {
            System.out.print((char)i);
        }
        fis.close();
    }
}