import java.util.Scanner;
import java.util.Scanner;

public class Stone_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // số test case

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            int minVal = Integer.MAX_VALUE;
            int maxVal = Integer.MIN_VALUE;
            int minPos = -1;
            int maxPos = -1;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] < minVal) {
                    minVal = a[i];
                    minPos = i;
                }
                if (a[i] > maxVal) {
                    maxVal = a[i];
                    maxPos = i;
                }
            }

            // Đưa minPos và maxPos về đúng thứ tự
            int left = Math.min(minPos, maxPos);
            int right = Math.max(minPos, maxPos);

            // 3 chiến lược:
            int op1 = right + 1;          // phá từ trái
            int op2 = n - left;           // phá từ phải
            int op3 = (left + 1) + (n - right); // phá hai bên

            int result = Math.min(op1, Math.min(op2, op3));
            System.out.println(result);
        }
    }
}
