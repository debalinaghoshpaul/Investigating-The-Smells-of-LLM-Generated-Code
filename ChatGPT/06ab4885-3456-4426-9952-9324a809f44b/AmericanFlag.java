public class AmericanFlag {

    public static void main(String[] args) {
        // Print the top blue rectangle
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print the white stripes
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Print the bottom red rectangle
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print the stars
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 2 && j == 1) {
                    System.out.print("===");
                } else if (i == 2 && j == 4) {
                    System.out.print("===");
                } else if (i == 3 && j == 0) {
                    System.out.print("===");
                } else if (i == 3 && j == 2) {
                    System.out.print("===");
                } else if (i == 3 && j == 4) {
                    System.out.print("===");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
