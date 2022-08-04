public class Main {
    public static void main(String[] args) {
        MyThread t1 =new MyThread("t1");
        t1.start();
        MyThread t2 =new MyThread("t2");
        t2.start();
    }
}