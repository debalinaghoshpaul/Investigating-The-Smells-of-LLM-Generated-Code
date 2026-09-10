import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class ForkJoinPoolDemo {

    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool pool = new ForkJoinPool();
        Future<Integer> future = pool.submit(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                Thread.sleep(1000);
            }
            return i;
        });
        Integer result = future.get(TimeUnit.MILLISECONDS, TimeUnit.SECONDS);
        System.out.println("Result: " + result);
    }
}

// 