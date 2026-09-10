public interface Playable {
    void play();
}

public class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Football");
    }
}

public class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Volleyball");
    }
}

public class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Basketball");
    }
}

public class Main {
    public static void main(String[] args) {
        Football f = new Football();
        Volleyball v = new Volleyball();
        Basketball b = new Basketball();

        f.play();
        v.play();
        b.play();
    }
}

