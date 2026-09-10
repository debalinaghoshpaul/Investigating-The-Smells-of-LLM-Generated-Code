public class WordCount {
    private int count;

    public WordCount() {
        count = 0;
    }

    public void setCountToZero() {
        count = 0;
    }

    public void increaseCount() {
        count++;
    }

    public void decreaseCount() {
        if (count > 0) {
            count--;
        }
    }

    public int getCount() {
        return count;
    }

    public void outputCount() {
        System.out.println("Current word count: " + count);
    }

    public static void main(String[] args) {
        WordCount wordCounter = new WordCount();

        wordCounter.outputCount();

        wordCounter.increaseCount();
        wordCounter.increaseCount();
        wordCounter.outputCount();

        wordCounter.decreaseCount();
        wordCounter.outputCount();

        wordCounter.setCountToZero();
        wordCounter.outputCount();
    }
}
