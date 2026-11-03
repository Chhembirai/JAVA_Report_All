/* Program to show variable length argument */
class VarArgs{
    static void sum(int... num){
        int total = 0;
        for(int i=0; i<num.length; i++){
            total += num[i];
        }
        System.out.println("Sum: " + total);
    }
}
public class aj {
    public static void main(String[] args) {
        VarArgs.sum(10, 67, 12);
        VarArgs.sum(10, 20, 30, 43, 59);
        VarArgs.sum(102, 21, 36, 40, 50, 60, 78);
    }
}