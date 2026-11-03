/* Show concept of abstract class and method */
package Unit3;
abstract class MotorVehicle{
    abstract void engine();
    void sound(){
        System.out.println("Motorvehicle makes sound");
    }
}
class MotorCycle extends MotorVehicle{
    @Override
    void engine() {
        System.out.println("Motorcycle engine uses petrol");
    }
}
public class aj {
    public static void main(String args[]) {
        MotorCycle mc = new MotorCycle();
        mc.engine();
        mc.sound();
    }
}
