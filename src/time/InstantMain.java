package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now(); // UTC 기준
        System.out.println("now = " + now);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        Instant from = Instant.from(zonedDateTime);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
//        Instant epochStart = Instant.ofEpochSecond(120);
        System.out.println("epochSecond = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        // 조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
