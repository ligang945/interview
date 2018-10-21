package thread;

public class IntThread implements Runnable {

    private Boolean holder;

    IntThread(Boolean holder) {
        this.holder = holder;
    }

    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() + " is running");
        synchronized (holder) {
            for (int i = 1; i <= 26; i++) {
                try {
                    holder.wait();
                    System.out.print(2 * i - 1);
                    System.out.print(2 * i);
                    holder.notify();
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
