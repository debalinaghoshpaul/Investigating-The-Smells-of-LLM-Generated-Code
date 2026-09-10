class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String color) {
        this.color = color;
    }

    public boolean isRed() {
        return this.color.equals("RED");
    }

    public boolean isGreen() {
        return this.color.equals("GREEN");
    }
}
