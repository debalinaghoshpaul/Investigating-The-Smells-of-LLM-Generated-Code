// Playable interface
interface Playable {
    void play();
}

// Football class
class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}

// Volleyball class
class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Volleyball");
    }
}

// Basketball class
class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Basketball");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();
        
        football.play();
        volleyball.play();
        basketball.play();
    }
}
