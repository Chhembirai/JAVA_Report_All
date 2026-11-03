/* Program to show array out of bound exception */
package Unit4;
public class ac {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occured: " + e);
        }
    }
}