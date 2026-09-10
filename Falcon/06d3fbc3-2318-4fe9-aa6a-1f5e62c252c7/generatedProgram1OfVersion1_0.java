public class MultiItemSale {
    private Sale[] sales;
    private int numSales;

    public MultiItemSale() {
        sales = new Sale[10];
        numSales = 0;
    }

    public void addSale(Sale sale) {
        if (numSales == sales.length) {
            Sale[] newSales = new Sale[sales.length * 2];
            System.arraycopy(sales, 0, newSales, 0, sales.length);
            sales = newSales;
        }
        sales[numSales++] = sale;
    }

    public double getTotalBill() {
        double total = 0.0;
        for (int i = 0; i < numSales; i++) {
            total += sales[i].getPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        MultiItemSale sale = new MultiItemSale();
        sale.addSale(new Sale("book", 10.0));
        sale.addSale(new DiscountSale("computer", 1000.0, 10));
        System.out.println("Total bill: " + sale.getTotalBill());
    }
}
