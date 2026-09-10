class Sports {
    public void play() {
        System.out.println("Playing generic sport");
    }
}

class Football extends Sports {
    @Override
    public void play() {
        System.out.println("Playing football");
    }
}

class Basketball extends Sports {
    @Override
    public void play() {
        System.out.println("Playing basketball");
    }
}

class Rugby extends Sports {
    @Override
    public void play() {
        System.out.println("Playing rugby");
    }
}

public class copilotTest {
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