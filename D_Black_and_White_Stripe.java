import java.util.Scanner;

public class D_Black_and_White_Stripe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine(); // bỏ dòng thừa

            String s = sc.nextLine();
            int countW = 0;

            // Đếm số 'W' trong đoạn đầu tiên dài k
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == 'W')
                    countW++;
            }

            int minW = countW;

            // Sliding window
            for (int i = k; i < n; i++) {
                if (s.charAt(i - k) == 'W') countW--; // ký tự bị loại ra
                if (s.charAt(i) == 'W') countW++;     // ký tự mới thêm vào
                minW = Math.min(minW, countW);
            }

            System.out.println(minW);
        }
    }
}