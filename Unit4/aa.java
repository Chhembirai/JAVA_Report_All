/* Program to show exception of 10/0 */
package Unit4;
public class aa {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred due to " + e);
        }
    }
}