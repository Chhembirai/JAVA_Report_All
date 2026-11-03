/* Show concept of access modifier */
package Unit3;
class Vehicles{
    String Company = "Toyota";
    protected String Country = "Japan";
    public String Engine = "V6 Petrol";
    void defshow() { // default access modifier
        System.out.println("(Default) Company: " + Company);
    }
    protected void proshow() {
        System.out.println("(Protected) Country: " + Country);
    }
    public void pubshow() {
        System.out.println("(Public) Engine: " + Engine);
    }
}
public class ak {
    private int VID = 10;
    private void prishow() {
        System.out.println("(Private) Vehicle ID: " + VID);
    }
    
    public static void main(String args[]) {
        ak p = new ak();
        p.prishow();
        
        Vehicles am = new Vehicles();
        am.defshow();
        am.proshow();
        am.pubshow();
    }
}