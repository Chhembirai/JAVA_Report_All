/* Program to create thread to see how synchronization works */
package Unit4;
class counter
{
    int count = 0;
    void nonsyncincrement()
    {
        count++;
    }
    synchronized void syncincrement()
    {
        count++;
    }
}
class NonSyncThread extends Thread{
    counter c;
    NonSyncThread(counter c){
        this.c = c;
    }
    public void run(){
        for(int i=0;i<2000;i++){
            c.nonsyncincrement();
        }
    }
}
class SyncThread extends Thread{
    counter c;
    SyncThread(counter c){
        this.c = c;
    }
    public void run(){
        for(int i=0;i<2000;i++){
            c.syncincrement();
        }
    }
}
public class ah {
    public static void main(String[] args) throws InterruptedException{
        counter c1 = new counter();
        NonSyncThread t1 = new NonSyncThread(c1);
        NonSyncThread t2 = new NonSyncThread(c1);
        NonSyncThread t3 = new NonSyncThread(c1);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Non Synchronized Count: "+c1.count);
        counter c2 = new counter();
        SyncThread t4 = new SyncThread(c2);
        SyncThread t5 = new SyncThread(c2);
        SyncThread t6 = new SyncThread(c2);
        t4.start();
        t5.start();
        t6.start();
        t4.join();
        t5.join();
        t6.join();
        System.out.println("Synchronized Count: "+c2.count);
    }
}