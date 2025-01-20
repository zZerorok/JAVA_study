package collection.deque.test.stack;

public class BrowserHistoryTest {

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        // 웹 페이지 방문 시나리오
        browser.visitPage("youtube.com");
        browser.visitPage("google.com");
        browser.visitPage("facebook.com");

        // 뒤로 가기 기능 사용 시나리오
        String currentPage1 = browser.goBack();
        System.out.println("currentPage1 = " + currentPage1);

        String currentPage2 = browser.goBack();
        System.out.println("currentPage2 = " + currentPage2);
    }
}
