import java.util.Arrays;
import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int current = n - i;
            arr[i] = current * current;
        }
        System.out.println(Arrays.toString(arr));
    }
}
