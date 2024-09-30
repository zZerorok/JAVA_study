package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV2 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        class Dice implements Process {

            @Override
            public void run() {
                // 코드 조각
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        }

        class Sum implements Process {

            @Override
            public void run() {
                // 코드 조각
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }

        Process dice = new Dice();
        Process sum = new Sum();

        System.out.println("hello 실행");
        hello(dice);
        hello(sum);
    }
}
