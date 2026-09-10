public enum Direction {
    NORTH, SOUTH, EAST, WEST;
}

public class Main {
    public static void main(String[] args) {
        Direction north = Direction.NORTH;
        Direction south = Direction.SOUTH;
        Direction east = Direction.EAST;
        Direction west = Direction.WEST;

        System.out.println(north.name());
        System.out.println(south.name());
        System.out.println(east.name());
        System.out.println(west.name());
    }
}

