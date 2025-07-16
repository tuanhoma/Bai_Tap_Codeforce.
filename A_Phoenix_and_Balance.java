import java.util.Scanner;
public class A_Phoenix_and_Balance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //input
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = (int)Math.pow(2, i + 1);
            }

            int sum1 = 0;
            int sum2 = 0;

            // Nhóm 1: lấy đồng xu lớn nhất (2^n) + (n/2 - 1) và các đồng xu nhỏ nhất trong mảng (n/2 - 1)
            sum1 += a[n - 1]; // 2^n
            for (int i = 0; i < (n / 2) - 1; i++) {
                sum1 += a[i];
            }

            // Nhóm 2: là các phần tử còn lại
            for (int i = (n / 2) - 1; i < n - 1; i++) {
                sum2 += a[i];
            }

            System.out.println(Math.abs(sum1 - sum2));
        }
    }
}
