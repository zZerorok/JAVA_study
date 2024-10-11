package exception.ex3;

import java.util.Scanner;

public class MainV3 {

    public static void main(String[] args) {
        NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();

            // 검증 로직
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // 정상 로직
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
