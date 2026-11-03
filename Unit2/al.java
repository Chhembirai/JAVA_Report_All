/* Program to show the use of this keyword */

class students
{
    String name;
    int roll;
    students()
    {
        this("Rajan", 16);
    }
    students(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
    }
    void display()
    {
        System.out.println("Name: "+name +"\nRoll No.: "+roll);
    }
    void showstudent(students s)
    {
        s.display();
    }
    students getstudent()
    {
        return this;
    }
    void callmethod()
    {
        this.display();
    }
}
public class al {
    public static void main(String[] args) 
    {
        students s1 = new students();
        s1.callmethod();
        s1.showstudent(s1);
        students s2 = s1.getstudent();
        System.out.println("Same object: "+(s1 == s2));
    }
}