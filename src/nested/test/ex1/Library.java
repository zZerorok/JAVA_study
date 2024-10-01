package nested.test.ex1;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        // 흔히 사용하는 방식
        if (bookCount < books.length) {
            books[bookCount++] = new Book(title, author);
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }

        // 아래의 방식은 코드를 파악하기 쉽고 검증 로직을 추가하기도 쉽다.
        // 1. 검증 로직 먼저 처리
//        if (bookCount >= books.length) {
//            System.out.println("도서관 저장 공간이 부족합니다.");
//            return;
//        }

        // 2. 정상 로직 처리
//        books[bookCount++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
