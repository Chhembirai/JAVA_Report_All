package Unit1;
//program for using nested if statement
public class ac {
    public static void main(String[] args) {
        System.out.println("Age = 20");
        int age = 20;
        if (age >= 18) {
            if (age >= 65) {
                System.out.println("Senior citizen");
            } else {
                System.out.println("Adult");
            }
        } else {
            System.out.println("Minor");
        }
    }
}