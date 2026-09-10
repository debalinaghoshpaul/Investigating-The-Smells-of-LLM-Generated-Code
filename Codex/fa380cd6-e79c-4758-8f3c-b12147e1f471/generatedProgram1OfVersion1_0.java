import java.util.Observable;
import java.util.Observer;

public class CounterView implements Observer {
    private CounterModel counterModel;

    public CounterView(CounterModel counterModel) {
        this.counterModel = counterModel;
        counterModel.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof CounterModel) {
            int counterValue = ((CounterModel) o).getCounterValue();
            String binaryValue = Integer.toBinaryString(counterValue);
            System.out.println("Binary value: " + binaryValue);
        }
    }

    public static void main(String[] args) {
        CounterModel counterModel = new CounterModel();
        CounterView counterView = new CounterView(counterModel);
        CounterController counterController = new CounterController(counterModel);

        // Test the program by counting values
        counterController.incrementCounter();
        counterController.incrementCounter();
        counterController.incrementCounter();
    }
}

class CounterModel extends Observable {
    private int counterValue;

    public int getCounterValue() {
        return counterValue;
    }

    public void setCounterValue(int counterValue) {
        this.counterValue = counterValue;
        setChanged();
        notifyObservers();
    }
}

class CounterController {
    private CounterModel counterModel;

    public CounterController(CounterModel counterModel) {
        this.counterModel = counterModel;
    }

    public void incrementCounter() {
        int counterValue = counterModel.getCounterValue();
        counterModel.setCounterValue(counterValue + 1);
    }
}