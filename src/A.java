import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.length() >= 12) {
            System.out.println("Strong");
        } else if (password.length() >= 8) {
            System.out.println("Moderate");
        } else {
            System.out.println("Weak");
        }
    }
}
