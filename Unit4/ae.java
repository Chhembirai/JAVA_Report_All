/* Program to implement throws exception handling */
package Unit4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ae {
    static void readFile(String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
    public static void main(String[] args){
        try{
            readFile("test.txt");
        } catch(FileNotFoundException e){
            System.out.println("Exception occured: "+e);
        }
    }
}