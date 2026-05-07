import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int cost = n * m;
        System.out.println(cost * 0.25);
    }
}
