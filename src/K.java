import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        if (n > m + 10) {
            System.out.println("FINED\n" + (n - m));
        } else {
            System.out.println("NOT FINED");
        }
    }
}
