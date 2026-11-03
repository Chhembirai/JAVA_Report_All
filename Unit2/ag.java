/* Program to implement pass by value and pass by reference */
/* For pass by value */
class byvalue{
    void change(int x){
        x = 120;
    }
}
class Emp{
    int id = 100;
}
class byreference{
    void change(Emp e){
        e.id = 120;
    }
}
public class ag {
    public static void main(String[]args){
        System.out.println("Pass by value:");
        byvalue obj1 = new byvalue();
        int id = 10;
        System.out.println("Before change:"+id);
        obj1.change(id);
        System.out.println("After change:"+id);
        System.out.println("Pass by reference:");
        byreference obj2 = new byreference();
        Emp e = new Emp();
        System.out.println("Before change:"+e.id);
        obj2.change(e);
        System.out.println("After change:"+e.id);
    }
}