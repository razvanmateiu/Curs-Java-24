package teme.temac2425;

public class Dayenum {

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public void Mesaj(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            case SATURDAY:
                System.out.println("Saturday");
                break;
            case SUNDAY:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }

    public static void main(String[] args) {
        Dayenum dayMessage = new Dayenum();

        dayMessage.Mesaj(Day.MONDAY);
        dayMessage.Mesaj(Day.WEDNESDAY);
        dayMessage.Mesaj(Day.SATURDAY);
    }
}
