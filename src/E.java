import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // عدد الكرات الكلي
        int k = scanner.nextInt(); // عدد الكرات الزرقاء
        System.out.println(100.0 * k / n);
    }
}
