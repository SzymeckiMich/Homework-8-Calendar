public class CalandarConverter {
    private final static int MONDAY = 1;
    private final static int TUESDAY = 2;
    private final static int WEDNESDAY = 3;
    private final static int THURSDAY = 4;
    private final static int FRIDAY = 5;
    private final static int SATURDAY = 6;
    private final static int SUNDAY = 7;

    static String convertDayToString(int dayNumber) {
        switch (dayNumber) {
            case MONDAY:
                return "Monday";
            case TUESDAY:
                return "Tuesday";
            case WEDNESDAY:
                return "Wednesday";
            case THURSDAY:
                return "Thursday";
            case FRIDAY:
                return "Friday";
            case SATURDAY:
                return "Saturdat";
            case SUNDAY:
                return "Sunday";
            default: {
                return "Nie ma takiego dnia";
            }

        }

    }
}
