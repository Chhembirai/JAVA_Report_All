package Unit1;
//program to use if else if and only if else statements
public class ab {
    public static void main(String[] args) {
        System.out.println("x = 10");
        int x = 10;
        if (x > 0) {
            System.out.println("Positive");
        } else if (x < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        if (x %5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible by 5");
        }
    }
}
