interface Playable {
    void play();
}

class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing football");
    }
}

class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing volleyball");
    }
}

class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing basketball");
    }
}

public class Sports {

    public static void main(String[] args) {
        Playable football = new Football();
        football.play(); // Playing football

        Playable volleyball = new Volleyball();
        volleyball.play(); // Playing volleyball

        Playable basketball = new Basketball();
        basketball.play(); // Playing basketball
    }
}
