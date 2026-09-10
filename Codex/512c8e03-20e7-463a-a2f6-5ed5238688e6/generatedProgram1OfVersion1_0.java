import java.util.ArrayList;

public class Marks<M extends Number> {
    public double orderAverage(ArrayList<M> marksList) {
        double sum = 0;
        for (M mark : marksList) {
            sum += mark.doubleValue();
        }
        return sum / marksList.size();
    }
}