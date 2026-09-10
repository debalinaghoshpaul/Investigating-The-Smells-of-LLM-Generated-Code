import java.util.concurrent.RecursiveTask;

public class ParallelRecursiveTask extends RecursiveTask<Long> {

    private static final int THRESHOLD = 1000;
    private long[] array;
    private int start;
    private int end;

    public ParallelRecursiveTask(long[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if (end - start <= THRESHOLD) {
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        } else {
            int mid = start + (end - start) / 2;
            ParallelRecursiveTask leftTask = new ParallelRecursiveTask(array, start, mid);
            ParallelRecursiveTask rightTask = new ParallelRecursiveTask(array, mid, end);

            leftTask.fork();
            long rightResult = rightTask.compute();
            long leftResult = leftTask.join();

            return leftResult + rightResult;
        }
    }

    public static void main(String[] args) {
        long[] array = new long[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ParallelRecursiveTask task = new ParallelRecursiveTask(array, 0, array.length);

        long result = forkJoinPool.invoke(task);
        System.out.println("Sum of array elements: " + result);
    }
}
