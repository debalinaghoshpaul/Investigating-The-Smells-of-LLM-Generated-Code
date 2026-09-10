abstract class Instrument {
    public abstract void play();
    public abstract void tune();
}

class Glockenspiel extends Instrument {
    @Override
    public void play() {
        System.out.println("Glockenspiel is playing");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the Glockenspiel");
    }
}

class Violin extends Instrument {
    @Override
    public void play() {
        System.out.println("Violin is playing");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the Violin");
    }
}

public class Main {
    public static void main(String[] args) {
        Instrument glockenspiel = new Glockenspiel();
        glockenspiel.play();
        glockenspiel.tune();

        Instrument violin = new Violin();
        violin.play();
        violin.tune();
    }
}
