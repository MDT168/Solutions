import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt(); // الهيلث
        int a = scanner.nextInt(); // الدرع
        int d = scanner.nextInt(); // قوة الزومبي

        int damage = d - a; // الضرر الحقيقي للزومبي مع حماية الدروع

        int hits = h / damage; // عدد الضربات هو الهيلث تقسيم الدمج
        if (h % damage == 0) { // اذا كان باقي قسمة الهيلث على الدمج يساوي صفر. يعني ان لا يوجد هيلث باقي (قد مات) فا نقص عدد الضربات بواحد
            hits--;
        }
        System.out.println(hits);
    }
}
