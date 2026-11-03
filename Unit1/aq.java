package Unit1;
/*program to implement 2D jagged array*/
public class aq {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];

        // Initialize the jagged array with different column sizes
        jaggedArray[0] = new int[2]; // First row has 2 columns
        jaggedArray[1] = new int[3]; // Second row has 3 columns
        jaggedArray[2] = new int[4]; // Third row has 4 columns

        // Fill the jagged array with values
        int value = 1;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = value++;
            }
        }

        // Print the jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
