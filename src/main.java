import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class main {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        String todaysDate = today.format(formatter);
        LocalDate lastFullMoon = LocalDate.of(2018, 8, 26);
        LocalDate nextFullMoon = LocalDate.of(2018, 9, 24);
        String fNextFullMoon = nextFullMoon.format(formatter);
        String fLastFullMoon = lastFullMoon.format(formatter);
        long daysTillNextFullMoon = today.until(nextFullMoon, ChronoUnit.DAYS);
        System.out.println("The last full moon was on " + fLastFullMoon);
        System.out.println("Today's date is " + todaysDate);
        System.out.println("The date of the next full moon is " + fNextFullMoon);
        System.out.println("The next full moon will be in " + daysTillNextFullMoon + " days");

    }
}