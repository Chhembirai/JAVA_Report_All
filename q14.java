/*program to show use of string buffer class*/
public class q14 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        
        // Append
        sb.append(" World");
        System.out.println("After append: " + sb.toString());
        
        // Insert
        sb.insert(5, ",");
        System.out.println("After insert: " + sb.toString());
        
        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb.toString());
        
        // Delete
        sb.delete(0, 6);
        System.out.println("After delete: " + sb.toString());
        
        // Length
        System.out.println("Length of StringBuffer: " + sb.length());
    }   
}