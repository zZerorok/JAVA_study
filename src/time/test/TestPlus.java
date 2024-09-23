package time.test;

import java.time.LocalDateTime;
import java.time.Period;

public class TestPlus {

    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        Period period = Period.of(1, 2, 3);

        LocalDateTime plusTime = time.plus(period).plusHours(4);
//        LocalDateTime plusTime = time.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);

        System.out.println("기준 시각: " +time);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + plusTime);
    }
}
