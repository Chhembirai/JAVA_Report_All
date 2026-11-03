/* Program to show static field in OOP concept*/
class Student{
    String name;
    int roll;
    static String college = "ABC";
    public void setdata(String n, int r){
        name = n;
        roll = r;
    }
    public void showdata(){
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("College: " + college);
    }
    public static void showcollege(){
        System.out.println("College: " + college);
    }
}
public class af {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setdata("Alice", 1);
        s2.setdata("Bob", 2);
        s1.showdata();
        s2.showdata();
        Student.showcollege();
    }
}
