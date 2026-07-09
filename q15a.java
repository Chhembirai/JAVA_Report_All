/*program to implement 2D array rectangle*/
public class q15a {
    public static void main(String[] args) {
        int[][] rectangle = new int[3][4]; // 4 rows and 5 columns

        // Initialize the rectangle with values
        int value = 1;
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                rectangle[i][j] = value++;
            }
        }

        // Print the rectangle
        System.out.println("Array:");
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(rectangle[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
