import java.util.Arrays;
import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int damage = scanner.nextInt();
        int n = scanner.nextInt();
        int[] healths = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            healths[i] = scanner.nextInt();
            sum += healths[i];
        }
        Arrays.sort(healths);
        if (sum > damage) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.println(Arrays.toString(healths));
    }
}
