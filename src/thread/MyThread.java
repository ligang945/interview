package thread;

public class MyThread extends Thread {

    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count -= 1;
        System.out.println("calc by " + MyThread.currentThread().getName() + "，count=" + count);
    }
}
