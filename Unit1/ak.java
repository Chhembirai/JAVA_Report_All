package Unit1;
//program to pattern pyramid with each row having same number decrase from 5 to 1 with each row having number of numbers from 1 to 5
public class ak {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}