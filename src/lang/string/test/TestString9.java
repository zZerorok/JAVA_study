package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] parts = email.split("@");
        String idPart = parts[0];
        String domainpart = parts[1];

        System.out.println("idPart = " + idPart);
        System.out.println("domainpart = " + domainpart);
    }
}
