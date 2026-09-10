// Base class Sports
class Sports {
    public void play() {
        System.out.println("Playing sports in general...");
    }
}

// Subclass Football
class Football extends Sports {
    public void play() {
        System.out.println("Playing football...");
    }
}

// Subclass Basketball
class Basketball extends Sports {
    public void play() {
        System.out.println("Playing basketball...");
    }
}

// Subclass Rugby
class Rugby extends Sports {
    public void play() {
        System.out.println("Playing rugby...");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Sports sports = new Sports();
        sports.play();

        Football football = new Football();
        football.play();

        Basketball basketball = new Basketball();
        basketball.play();

        Rugby rugby = new Rugby();
        rugby.play();
    }
}
