class Node {
    private String name;
    private Node north;
    private Node south;
    private Node east;
    private Node west;

    public Node(String name) {
        this.name = name;
    }

    public void setNorth(Node north) {
        this.north = north;
    }

    public void setSouth(Node south) {
        this.south = south;
    }

    public void setEast(Node east) {
        this.east = east;
    }

    public void setWest(Node west) {
        this.west = west;
    }

    public String getName() {
        return name;
    }

    public Node getNorth() {
        return north;
    }

    public Node getSouth() {
        return south;
    }

    public Node getEast() {
        return east;
    }

    public Node getWest() {
        return west;
    }
}

public class Maze {
    public static void main(String[] args) {
        // Create nodes
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");
        Node G = new Node("G");
        Node H = new Node("H");
        Node I = new Node("I");
        Node J = new Node("J");
        Node K = new Node("K");
        Node L = new Node("L");

        // Set node connections
        A.setEast(B);
        A.setSouth(E);

        B.setWest(A);
        B.setSouth(F);

        C.setEast(D);
        C.setSouth(G);

        D.setWest(C);
        D.setSouth(H);

        E.setNorth(A);
        E.setEast(F);
        E.setSouth(I);

        F.setWest(E);
        F.setNorth(B);
        F.setEast(G);
        F.setSouth(J);

        G.setWest(F);
        G.setNorth(C);
        G.setEast(H);
        G.setSouth(K);

        H.setWest(G);
        H.setNorth(D);
        H.setSouth(L);

        I.setNorth(E);
        I.setEast(J);

        J.setWest(I);
        J.setNorth(F);
        J.setEast(K);

        K.setWest(J);
        K.setNorth(G);
        K.setEast(L);

        L.setWest(K);
        L.setNorth(H);

        // Start at node A
        Node current = A;

        // Traverse the maze
        while (current != L) {
            System.out.println("You are in room " + current.getName() + " of a maze of twisty little passages, all alike.");

            // Output possible moves
            if (current.getNorth() != null) {
                System.out.println("You can go north.");
            }
            if (current.getSouth() != null) {
                System.out.println("You can go south.");
            }
            if (current.getEast() != null) {
                System.out.println("You can go east.");
            }
            if (current.getWest() != null) {
                System.out.println("You can go west.");
            }

            // Get user input for the next move
            // Assuming the user enters a valid direction (north, south, east, or west)
            // Update the current node based on the user's input
            // For example, if the user enters "north", set current = current.getNorth()

            // Replace the following line with your code to get user input and update the current node
            break; // Remove this line once you have implemented the user input

            // Repeat until the user reaches the finish in node L
        }

        System.out.println("Congratulations! You reached the finish in room L.");
    }
}