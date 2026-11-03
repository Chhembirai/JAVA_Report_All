/* Program to display id, name, address and salary of 3 people in OOP concept */

class People{
    int id, salary;
    String name, address;
    void setdata(int i, String n, String a, int s){
        this.id = i;
        this.name = n;
        this.address = a;
        this.salary = s;
    }
    void display(){
        System.out.println("ID:"+this.id);
        System.out.println("Name:"+this.name);
        System.out.println("Address:"+this.address);
        System.out.println("Salary:"+this.salary);
    }
    void show(){
        this.display();
    }
}

public class ab {
    public static void main(String[]args){
        People e1 = new People();
        People e2 = new People();
        People e3 = new People();
        e1.setdata(101,"Giri", "Lalitpur", 34000);
        e2.setdata(102,"Chandre", "Makwanpur", 44000);
        e3.setdata(103,"Ramesh", "Kathmandu", 54000);
        e1.show();
        e2.show();
        e3.show();
    }
}