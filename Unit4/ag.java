/* Program to implement multi-threading to increment variable of object */
package Unit4;
class runn implements Runnable{
    static int c=0;
    public void run(){
        for(int i=0;i<100;i++){
            c++;
        }
    }
}
public class ag {
    public static void main(String[] args) throws InterruptedException{
        runn c = new runn();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        t1.start();
        t2.start();
        t3.start();
        try{
            t1.join();
            t2.join();
            t3.join();
        } catch(Exception e){
            System.out.println("Exception occured: "+e);
        }
        System.out.println("Final Count: "+runn.c);
    }
}