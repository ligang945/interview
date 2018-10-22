package thread;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Boolean holder = true;

        IntThread intThread = new thread.IntThread(holder);
        CharThread charThread = new thread.CharThread(holder);

        Thread thread1 = new Thread(intThread);
        Thread thread2 = new Thread(charThread);

        thread1.start();
        Thread.sleep(10);
        thread2.start();
    }
}
