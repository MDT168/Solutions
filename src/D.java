import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int r = n / k;
        if (n % k > 0) r++;
        System.out.println(r);
    }
}
