import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebCrawler {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ": Crawling " + i);
                }
            });
        }
        executorService.shutdown();
    }
}

// 