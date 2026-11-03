package Unit4;
/* Program to implement how thread priority works */
class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(getName()+": "+i);
        }
    }
}
public class ai {
    public static void main(String[] args){
        MyThread t1 = new MyThread("Low Priority");
        MyThread t2 = new MyThread("Normal Priority");
        MyThread t3 = new MyThread("High Priority");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread 1 Priority: "+t1.getPriority());
        System.out.println("Thread 2 Priority: "+t2.getPriority());
        System.out.println("Thread 3 Priority: "+t3.getPriority());
        t1.start();
        t2.start();
        t3.start();
    }
}