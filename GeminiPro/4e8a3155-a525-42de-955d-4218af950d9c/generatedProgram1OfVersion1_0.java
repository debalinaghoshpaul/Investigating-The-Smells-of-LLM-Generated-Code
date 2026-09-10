import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private String director;
    private List<String> actors;
    private List<String> reviews;

    public Movie(String title, String director, List<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActors() {
        return actors;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", actors=" + actors +
                ", reviews=" + reviews +
                '}';
    }

    public static void main(String[] args) {
        Movie movie = new Movie("The Shawshank Redemption", "Frank Darabont", List.of("Tim Robbins", "Morgan Freeman"));
        movie.addReview("This is the best movie I've ever seen!");
        movie.addReview("I really enjoyed this movie. The acting was superb.");
        System.out.println(movie);
    }
}
