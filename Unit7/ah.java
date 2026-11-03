/* Use of optional class if string exists or not */
package Unit7;
import java.util.Optional;
public class ah {
    public static void main(String[]args){
        String name = "Hangden";
        Optional<String> opname = Optional.ofNullable(name);
        if (opname.isPresent()){
            System.out.println("String value Exists"+"\nName: "+opname.get());
        } else {
            System.out.println("Name is not present");
        }
    }
}
