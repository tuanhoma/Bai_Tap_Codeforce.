import java.util.Scanner;

public class A_Lineland_Mail_gpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {
            long min, max;

            if (i == 0) {
                // Thành phố đầu tiên chỉ có hàng xóm bên phải
                // vì được sắp xếp ban đầu từ bé đến lớn
                min = Math.abs(a[i] - a[i + 1]);// vì đã được sắp xếp nên min sẽ là số hiện tại trừ đi số kế tiếp được dò liên tục, nếu 2 số liên tiếp là âm thì nó vẫn là số bé nhất vì (-a - (-b)) => (-a + b)
                max = Math.abs(a[n - 1] - a[i]);// lớn nhất sẽ là số lớn nhất trừ bé nhất
            } else if (i == n - 1) {
                // Thành phố cuối cùng chỉ có hàng xóm bên trái
                min = Math.abs(a[i] - a[i - 1]);// là là số liên tiếp trừ nhau
                max = Math.abs(a[i] - a[0]);// là số lớn nhất trừ bé nhất
            } else {
                // Thành phố ở giữa có 2 hàng xóm
                min = Math.min(Math.abs(a[i] - a[i - 1]), Math.abs(a[i] - a[i + 1]));// xem số liên tiếp bến trái hay phải là bé hơn
                max = Math.max(Math.abs(a[i] - a[0]), Math.abs(a[n - 1] - a[i]));// xem số hiện tại trừ số bé nhất hay là số lớn nhất trừ số hiện tại ra số lớn nhất
            }

            System.out.println(min + " " + max);
        }

        sc.close();
    }
}
