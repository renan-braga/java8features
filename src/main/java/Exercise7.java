import java.time.*;
import java.time.temporal.ChronoUnit;

public class Exercise7 {

    public static void main(String[] args) {
        System.out.println("\n\npt1");
        LocalDate bastilleFall = LocalDate.of(1789, Month.JULY, 14);
        LocalDate eniacRelease = LocalDate.of(1946, Month.FEBRUARY, 14);
        System.out.println("Days between ENIAC release and Bastille Fall: " + bastilleFall.until(eniacRelease, ChronoUnit.DAYS));

        System.out.println("\n\npt2");
        LocalDateTime now = LocalDateTime.now();
        long plusDays = Math.round(Math.random() * 1000);
        System.out.printf("Today's date is %s, in %d days, it will be %s.%n", now, plusDays, now.plus(plusDays, ChronoUnit.DAYS));

    }
}
