// Instrument.java
abstract class Instrument {
    public abstract void play();
    public abstract void tune();
}

// Glockenspiel.java
class Glockenspiel extends Instrument {
    @Override
    public void play() {
        System.out.println("Plink, plink, plink...");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the glockenspiel...");
    }
}

// Violin.java
class Violin extends Instrument {
    @Override
    public void play() {
        System.out.println("Screech, screech, screech...");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the violin...");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Glockenspiel glockenspiel = new Glockenspiel();
        Violin violin = new Violin();

        glockenspiel.play();
        glockenspiel.tune();

        violin.play();
        violin.tune();
    }
}
