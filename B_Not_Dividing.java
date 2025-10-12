import java.util.Arrays;
import java.util.Scanner;

public class B_Not_Dividing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            // Nếu phần tử đầu tiên là 1 thì cộng 1 để tránh chia hết
            if (a[0] == 1) a[0]++;

            for (int i = 1; i < n; i++) {

                if (a[i] == 1) a[i]++;// Nếu phần tử là 1 thì cộng 1 để tránh chia hết

                // nếu phần tử sau chia hết phần tử trước thì tăng phần tử sau
                if (a[i] % a[i - 1] == 0) {
                    a[i]++;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + (i == n - 1 ? "\n" : " "));
            }
        }
    }
}
