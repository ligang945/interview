package thread.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolTest {
    public static void main(String[] args) {
        byte[] b1, b2, b3, b4;//定义变量
        b1 = new byte[1024 * 1024];//分配 1MB 堆空间，考察堆空间的使用情况
        b2 = new byte[1024 * 1024];
        b3 = new byte[1024 * 1024];
        b4 = new byte[1024 * 1024];
        for (int i = 0; i < 2; i++) {
            try {
                TimeUnit.SECONDS.sleep(30L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        TestRunnable runnable = new TestRunnable();
//        Future<Integer> future = executor.submit(runnable);
//        try {
//            Integer result = future.get();
//            System.out.println(result);
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }
//        executor.shutdown();
    }
}


class TestRunnable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "线程被调用了。");
        TimeUnit.MINUTES.sleep(10);
        return 1234;
    }
}

