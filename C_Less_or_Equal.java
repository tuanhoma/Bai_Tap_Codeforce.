import java.util.Arrays;
import java.util.Scanner;

public class C_Less_or_Equal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        if (k == 0) {
            if (a[0] == 1)
                System.out.println(-1);
            else
                System.out.println(a[0] - 1);
        } else {
            int x = a[k - 1];
            // nếu tồn tại phần tử thứ k và nó bằng x thì không hợp lệ
            if (k < n && a[k] == x)
                System.out.println(-1);
            else// ỉn ra x nếu hợp lệ
                System.out.println(x);
        }
    }
}
