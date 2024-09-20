package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2020, 3, 2, 14, 30, 59);
        System.out.println("dateTime = " + dateTime);

        LocalDateTime changeDateTime1 = dateTime.with(ChronoField.YEAR, 2021);
        System.out.println("changeDateTime1 = " + changeDateTime1);

        LocalDateTime changeDateTime2 = dateTime.withYear(2020);
        System.out.println("changeDateTime2 = " + changeDateTime2);

        // TemporalAdjuster 사용
        // 다음주 금요일
        LocalDateTime with1 = dateTime.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준 날짜: " + dateTime);
        System.out.println("다음 금요일: " + with1);

        // 이번 달의 마지막 일요일
        LocalDateTime with2 = dateTime.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("같은 달의 마지막 일요일: " + with2);
    }
}
