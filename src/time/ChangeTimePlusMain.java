package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dateTime = " + dateTime);

        LocalDateTime plusDate1 = dateTime.plus(10, ChronoUnit.YEARS);
        System.out.println("plusDate = " + plusDate1);

        LocalDateTime plusDate2 = dateTime.plusYears(10);
        System.out.println("plusDate2 = " + plusDate2);

        Period period = Period.ofYears(10);
        LocalDateTime plusDate3 = dateTime.plus(period);
        System.out.println("plusDate3 = " + plusDate3);
    }
}
