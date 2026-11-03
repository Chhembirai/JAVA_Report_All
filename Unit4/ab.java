/* Program to show file not found exception */
package Unit4;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class ab {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("abc.txt");
        } catch(FileNotFoundException e){
            System.out.println("Exception occured: "+e);
        }
    }
}