import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
            System.out.println("No songs in the library.");
            return;
        }

        Random random = new Random();
        int index = random.nextInt(songs.size());
        String randomSong = songs.get(index);
        System.out.println("Playing random song: " + randomSong);
    }
}
