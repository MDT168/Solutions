import java.util.Arrays;
import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
