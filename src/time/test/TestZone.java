package time.test;

import java.time.*;

public class TestZone {

    public static void main(String[] args) {
        // 내가 작성한 코드
//        LocalDateTime localDateTime = LocalDateTime.of(2024, 1, 1, 9, 0, 0);

//        ZonedDateTime seoulTime = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Seoul"));
//        ZonedDateTime londonTime = ZonedDateTime.of(localDateTime, ZoneId.of("Europe/London"));
//        ZonedDateTime newYorkTime = ZonedDateTime.of(localDateTime, ZoneId.of("America/New_York"));

        // 강의에서 제공한 코드
        ZonedDateTime seoulTime = ZonedDateTime.of(
                LocalDate.of(2024, 1, 1),
                LocalTime.of(9, 0, 0),
                ZoneId.of("Asia/Seoul")
        );
        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newYorkTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간: " + seoulTime);
        System.out.println("런던의 회의 시간: " + londonTime);
        System.out.println("뉴욕의 회의 시간: " + newYorkTime);
    }
}
