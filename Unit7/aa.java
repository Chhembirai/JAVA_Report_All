/* Singleton pattern */
package Unit7;
class PrinterManager{
    private static PrinterManager instance = new PrinterManager();
    private PrinterManager(){
        System.out.println("Printer manager program created");
    }
    public static PrinterManager getInstance(){
        return instance;
    }
    public void print(String msg){
        System.out.println("Printing: "+msg);
    }
}
public class aa{
    public static void main(String []args){
        PrinterManager p1 = PrinterManager.getInstance();
        PrinterManager p2 = PrinterManager.getInstance();
        p1.print("Reporting");
        p2.print("Invoice");
        if (p1 == p2){
            System.out.println("Same Objects = " + (p1 == p2));
        }
    }
}