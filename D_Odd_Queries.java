import java.util.Scanner;
import java.util.Arrays;

public class D_Odd_Queries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] a = new int[n];

            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();

                // Tính tổng đoạn [l, r]
                long subSum = 0;
                for (int i = l - 1; i < r; i++) {
                    subSum += a[i];
                }

                long total = sum - subSum + (long)(r - l + 1) * k;

                if (total % 2 != 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}