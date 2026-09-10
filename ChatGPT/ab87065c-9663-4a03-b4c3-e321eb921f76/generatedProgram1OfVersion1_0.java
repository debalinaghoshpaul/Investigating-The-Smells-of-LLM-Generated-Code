public class Container {
    private double maxCapacity;
    private double quantity;

    public Container(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.quantity = 0;
    }

    public double quantity() {
        return this.quantity;
    }

    public double leftover() {
        return this.maxCapacity - this.quantity;
    }

    public void full() {
        this.quantity = this.maxCapacity;
    }

    public void empty() {
        this.quantity = 0;
    }

    public void transfer(Container other, double amount) {
        if (this.quantity >= amount) {
            if (other.leftover() >= amount) {
                this.quantity -= amount;
                other.quantity += amount;
            }
        }
    }

    public void displayQuantity() {
        System.out.println("Current quantity: " + this.quantity + " liters");
    }
}
