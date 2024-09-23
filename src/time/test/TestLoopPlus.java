package time.test;

import java.time.LocalDate;

public class TestLoopPlus {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 1);

        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = date.plusWeeks(2 * i);
            System.out.println("날짜 " + (i + 1) + ": " + nextDate);
        }
//        for (int i = 0; i < 5; i++) {
//            LocalDate nextDate = date.plus(2 * i, ChronoUnit.WEEKS);
//            System.out.println("날짜 " + (i + 1) + ": " + nextDate);
//        }
    }
}
