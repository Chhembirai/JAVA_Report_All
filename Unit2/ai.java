/* Program to show static nested class */
class outer1 {
    static int id = 142;
    static class inner1 {
        void message() {
            System.out.println("Static nested class ID: " +id);
        }
    }
}
class outer2 {
    int id = 165;
    class inner2 {
        void message() {
            System.out.println("Non-Static inner class ID: "+id);
        }
    }
}
class outer3{
    int id = 198;
    void display() {
        class inner3 {
            void message() {
                System.out.println("Local inner class ID: "+id);
            }
        }
        inner3 i = new inner3();
        i.message();
    }
}
public class ai {
    public static void main(String args[]) {
        outer1.inner1 o1 = new outer1.inner1();
        o1.message();
        outer2 o2 = new outer2();
        outer2.inner2 obj = o2.new inner2();
        obj.message();
        outer3 o3 = new outer3();
        o3.display();
        Runnable r = new Runnable() {
            int id = 187;
            public void run() {
                System.out.println("Anonymous inner class ID: "+id);
            }
        };
        r.run();
    }
}