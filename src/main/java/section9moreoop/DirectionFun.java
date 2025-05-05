package section9moreoop;

/**
 * Demonstrates the use of enums to represent cardinal directions.
 * Shows how to use a switch statement with enum values.
 */
public class DirectionFun {
    /**
     * Enum representing the four cardinal directions.
     * Each direction has a full name and a compass degree value.
     */
    private enum Direction {
        NORTH(0, "North"),
        EAST(90, "East"),
        SOUTH(180, "South"),
        WEST(270, "West");

        private final int degrees;
        private final String fullName;

        Direction(int degrees, String fullName) {
            this.degrees = degrees;
            this.fullName = fullName;
        }

        public int getDegrees() {
            return degrees;
        }

        public String getFullName() {
            return fullName;
        }
    }

    /**
     * Main method that demonstrates the use of the Direction enum
     * and switch statement.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Direction directionOfTravel = Direction.NORTH;

        switch (directionOfTravel) {
            case NORTH:
                System.out.println("You're traveling " + Direction.NORTH.getFullName() + "!");
                break;
            case SOUTH:
                System.out.println("You're traveling " + Direction.SOUTH.getFullName() + "!");
                break;
            case EAST:
                System.out.println("You're traveling " + Direction.EAST.getFullName() + "!");
                break;
            case WEST:
                System.out.println("You're traveling " + Direction.WEST.getFullName() + "!");
                break;
        }

        // Additional demonstration of enum functionality
        System.out.println("\nCompass degrees for each direction:");
        for (Direction dir : Direction.values()) {
            System.out.println(dir.getFullName() + ": " + dir.getDegrees() + "°");
        }
    }
}
