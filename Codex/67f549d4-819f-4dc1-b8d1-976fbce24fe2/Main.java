// CounterView.java
public class CounterView {
    public void display(int counterValue) {
        System.out.println("Counter: " + counterValue);
    }
}

// CounterModel.java
public class CounterModel {
    private int counterValue;

    public CounterModel(int initialValue) {
        this.counterValue = initialValue;
    }

    public void increment() {
        counterValue++;
    }

    public int getCounterValue() {
        return counterValue;
    }
}

// CounterController.java
public class CounterController {
    private CounterModel counterModel;
    private CounterView counterView;
    private int startValue;
    private int endValue;

    public CounterController(int startValue, int endValue) {
        this.startValue = startValue;
        this.endValue = endValue;
        this.counterModel = new CounterModel(startValue);
        this.counterView = new CounterView();
    }

    public void start() {
        while (counterModel.getCounterValue() <= endValue) {
            counterView.display(counterModel.getCounterValue());
            counterModel.increment();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Example usage
        CounterController counterController = new CounterController(1, 10);
        counterController.start();
    }
}
