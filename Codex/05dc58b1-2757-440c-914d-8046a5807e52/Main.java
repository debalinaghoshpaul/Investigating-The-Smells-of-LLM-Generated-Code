//MusicLibrary.java

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
  private ArrayList < Song > songs;

  public MusicLibrary() {
    songs = new ArrayList < Song > ();
  }
  public void addSong(Song song) {
    songs.add(song);
  }
  public void removeSong(Song song) {
    songs.remove(song);
  }
  public ArrayList < Song > getSongs() {
    return songs;
  }
  public void playRandomSong() {
    int size = songs.size();
    if (size == 0) {
      System.out.println("No songs in the library.");
      return;
    }
    Random rand = new Random();
    int index = rand.nextInt(size);
    System.out.println("Now playing: " + songs.get(index).getTitle() + " by " + songs.get(index).getArtist());
  }
}

//Song.class
public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}

//Main.java
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
    MusicLibrary library = new MusicLibrary();
    library.addSong(new Song("Midnight Train to Georgia", "Gladys Knight & the Pips"));
    library.addSong(new Song("Stairway to Heaven", "Led Zeppelin"));
    library.addSong(new Song("Imagine", "John Lennon"));
    library.addSong(new Song("All by Myself", "Eric Carmen"));
    library.addSong(new Song("What'd I Say", "Ray Charles"));
    library.addSong(new Song("Walking in Memphis", "Marc Cohn"));
    library.addSong(new Song("In the Air Tonight", "Phil Collins"));

    System.out.println("All songs:");
    for (Song song: library.getSongs()) {
      System.out.println(song.getTitle() + " by " + song.getArtist());
    }
    System.out.println("\n**Playing Random Song**");
    library.playRandomSong();
    System.out.println();
    library.playRandomSong();
    System.out.println();
    library.playRandomSong();
  }
}
