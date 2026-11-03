/* Program to implement constructor in OOP */
class Default{
    int id;
    String name;
    void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
    }
}
class NoArgument{
    int id;
    String name;
    NoArgument(){
        id = 12;
        name = "Chandra";
    }
    void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
    }
}
class Parameterized{
    int id;
    String name;
    Parameterized(int i, String n){
        id = i;
        name = n;
    }
    void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
    }
}
public class ae {
    public static void main(String[]args){
        System.out.println("Default constructor:");
        Default d = new Default();
        d.display();
        NoArgument n= new NoArgument();
        System.out.println("No Argument constructor:");
        n.display();
        System.out.println("Parameterized constructor:");
        Parameterized p1 = new Parameterized(17,"Khagendra");
        Parameterized p2 = new Parameterized(19, "Suman");
        p1.display();
        p2.display();
    }
}