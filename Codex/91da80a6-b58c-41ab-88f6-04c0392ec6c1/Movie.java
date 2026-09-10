public class Movie {
    private String title;
    private int minutes;
    private int year;
    protected double price;

    public Movie(String title, int year, double price) {
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void printDescription() {
        System.out.println("Title: " + title);
        System.out.println("Minutes: " + minutes);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Movie 1", 2021, 9.99);
        Movie movie2 = new Movie("Movie 2", 2022, 14.99);

        movie1.printDescription();
        System.out.println();
        movie2.printDescription();
    }
}
