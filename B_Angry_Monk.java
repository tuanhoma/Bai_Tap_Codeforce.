import java.util.Scanner;

public class B_Angry_Monk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[k];

            int maxValue = Integer.MIN_VALUE;

            for (int i = 0; i < k; i++) {
                a[i] = sc.nextInt();
                if (a[i] > maxValue) {
                    maxValue = a[i];
                }
            }

            int count = 0;
            boolean skipped = false;

            for (int i = 0; i < k; i++) {
                if (!skipped && a[i] == maxValue) {
                    skipped = true; // Bỏ qua lần đầu tiên gặp maxValue
                    continue;// dùng để tiếp tục đến vòng lặp tiếp theo
                }

                if (a[i] >= 2) {
                    count += a[i] * 2 - 1;
                } else {
                    count++;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}
