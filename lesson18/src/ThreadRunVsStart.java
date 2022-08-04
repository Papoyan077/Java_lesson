public class ThreadRunVsStart {
    public static void main(String[] args) {
        Thread t=new MyThread("T");
        t.run();
        System.out.println();
        System.out.println("Main is working ");
    }
}
