/* Factory pattern */
package Unit7;
interface Xiaomi{
    void parts();
}
class Redmi implements Xiaomi{
    public void parts(){
        System.out.println("Redmi : Qualcom Snapdragon");
    }
}
class POCO implements Xiaomi{
    public void parts(){
        System.out.println("POCO : Snapdragon");
    }
}
class Factory{
    public static Xiaomi getbrand(String type){
        if (type.equalsIgnoreCase("redmi"))
            return new Redmi();
        else if (type.equalsIgnoreCase("poco"))
            return new POCO();
        return null;
    }
}
public class ab {
    public static void main(String[]args){
        Xiaomi p1 = Factory.getbrand("redmi");
        p1.parts();
        Xiaomi p2 = Factory.getbrand("poco");
        p2.parts();
    }
}