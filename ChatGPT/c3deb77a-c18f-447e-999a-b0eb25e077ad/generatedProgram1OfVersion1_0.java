public class BookStore {
    private static int totalBooksSold = 0;
    
    private String bookCategory;
    private String author;
    private String title;
    private String publisher;
    private double sellingPrice;
    private int quantity;
    
    public BookStore(String bookCategory, String author, String title, String publisher, double sellingPrice, int quantity) {
        this.bookCategory = bookCategory;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
    }
    
    public void trackSalesStatus() {
        System.out.println("Total number of books sold: " + totalBooksSold);
    }
    
    public void displayQuantity() {
        System.out.println("Quantity available for book '" + title + "': " + quantity);
    }
    
    public void sellBook(int numSold) {
        if(quantity >= numSold) {
            totalBooksSold += numSold;
            quantity -= numSold;
            System.out.println(numSold + " book(s) of '" + title + "' sold successfully.");
        } else {
            System.out.println("Insufficient quantity available for sale.");
        }
    }
    
    public static void main(String[] args) {
        BookStore book1 = new BookStore("Kids", "Unknown Author", "Adventure Time", "ABC Publishing", 20.99, 50);
        BookStore book2 = new BookStore("Engineering", "John Smith", "Introduction to Java", "XYZ Publishing", 29.99, 30);
        
        book1.sellBook(10);
        book1.displayQuantity();
        book1.trackSalesStatus();
        
        book2.sellBook(5);
        book2.displayQuantity();
        book2.trackSalesStatus();
    }
}
