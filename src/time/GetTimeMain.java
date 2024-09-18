package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("YEAR = " + dateTime.get(ChronoField.YEAR));
        System.out.println("MONTH_OF_YEAR = " + dateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DAY_OF_MONTH = " + dateTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOUR_OF_DAY = " + dateTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MINUTE_OF_HOUR = " + dateTime.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SECOND_OF_MINUTE = " + dateTime.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("편의 메서드 제공");
        System.out.println("YEAR = " + dateTime.getYear());
        System.out.println("MONTH_OF_YEAR = " + dateTime.getMonth().getValue());
        System.out.println("DAY_OF_MONTH = " + dateTime.getDayOfMonth());
        System.out.println("HOUR_OF_DAY = " + dateTime.getHour());
        System.out.println("MINUTE_OF_HOUR = " + dateTime.getMinute());
        System.out.println("SECOND_OF_MINUTE = " + dateTime.getSecond());

        System.out.println("편의 메서드에 없음");
        System.out.println("MINUTE_OF_DAY = " + dateTime.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("SECOND_OF_DAY = " + dateTime.get(ChronoField.SECOND_OF_DAY));
    }
}
