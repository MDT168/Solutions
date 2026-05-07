import java.util.Arrays;
import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = scanner.next();
        }
        Arrays.sort(names);
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}
