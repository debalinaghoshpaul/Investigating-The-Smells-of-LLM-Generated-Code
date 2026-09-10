import java.util.*;

public class MusicLibrary {

    private List<String> songs;

    public MusicLibrary() {
        songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the library");
        } else {
            int randomIndex = new Random().nextInt(songs.size());
            String randomSong = songs.get(randomIndex);
            System.out.println("Playing: " + randomSong);
        }
    }

    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

        // Add some songs to the library
        library.addSong("Song 1");
        library.addSong("Song 2");
        library.addSong("Song 3");

        // Play a random song
        library.playRandomSong();

        // Remove a song from the library
        library.removeSong("Song 2");

        // Play another random song
        library.playRandomSong();

        // Test case: empty library
        MusicLibrary emptyLibrary = new MusicLibrary();
        emptyLibrary.playRandomSong();
    }
}
