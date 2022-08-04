public class MyThread extends Thread {
    public MyThread(String s) {
        super(s);
    }

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.print(getName() + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
