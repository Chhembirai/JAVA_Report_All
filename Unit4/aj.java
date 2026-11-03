/* Program to see how inter thread communication works */
package Unit4;
class Shared{
    synchronized void show(){
        System.out.println(Thread.currentThread().getName()+ "is waiting...");
        try{
            wait();
        } catch(Exception e){
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName()+ "resumed...");
    }
    synchronized void notifyOne(){
        System.out.println("notify called");
        notify();
    }
    synchronized void notifyAllThreads(){
        System.out.println("notifyAll called");
        notifyAll();
    }
}
class Thread2 extends Thread{
    Shared s;
    Thread2(Shared s, String name){
        super(name);
        this.s = s;
    }
    public void run(){
        s.show();
    }
}
public class aj {
    public static void main(String[] args){
        Shared s = new Shared();
        Thread2 t1 = new Thread2(s, "Thread 1 ");
        Thread2 t2 = new Thread2(s, "Thread 2 ");
        Thread2 t3 = new Thread2(s, "Thread 3 ");
        t1.start();
        t2.start();
        t3.start();
        try{
            Thread.sleep(1000);
            s.notifyOne();
            Thread.sleep(1000);
            s.notifyAllThreads();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}