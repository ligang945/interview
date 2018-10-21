package thread;

public class CharThread implements Runnable {

    private Boolean holder;

    CharThread(Boolean holder) {
        this.holder = holder;
    }

    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() + " is running");
        synchronized (holder) {
            holder.notify();
            for (char c = 'A'; c <= 'Z'; c++) {
                try {
                    holder.wait();
                    System.out.print(c);
                    holder.notify();
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
