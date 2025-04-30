package section9moreoop;

/**
 * Demonstrates the use of enums to represent days of the week.
 * Includes a method to determine if a given day is a weekday.
 */
public class DaysOfTheWeek {
    /**
     * Enum representing the days of the week.
     * Each day has a full name and an abbreviation.
     */
    private enum DayOfWeek {
        MONDAY("MON"),
        TUESDAY("TUES"),
        WEDNESDAY("WED"),
        THURSDAY("THURS"),
        FRIDAY("FRI"),
        SATURDAY("SAT"),
        SUNDAY("SUN");

        private final String abbreviation;

        DayOfWeek(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        public String getAbbreviation() {
            return abbreviation;
        }
    }

    /**
     * Main method that demonstrates the use of the DayOfWeek enum
     * and the isWeekday method.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        DayOfWeek theDay = DayOfWeek.SATURDAY;
        if (isWeekday(theDay)) {
            System.out.println("It's a weekday!");
        } else {
            System.out.println("Yay! It's the weekend!");
        }
    }

    /**
     * Determines if a given day is a weekday (Monday through Friday)
     * 
     * @param day the day to check
     * @return true if the day is a weekday, false if it's a weekend day
     */
    public static boolean isWeekday(DayOfWeek day) {
        return day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY;
    }
}
