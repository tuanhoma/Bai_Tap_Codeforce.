import java.util.Scanner;

public class A_Mainak_and_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            int ans = 0;

            // Case 1: max(a) - a1
            // Đưa phần tử lớn nhất về cuối → max(a) - a1
            int maxA = Integer.MIN_VALUE;
            for (int x : a) maxA = Math.max(maxA, x);
            ans = Math.max(ans, maxA - a[0]);

            // Case 2: an - min(a)
            // Đưa phần tử nhỏ nhất về đầu → an - min(a)
            int minA = Integer.MAX_VALUE;
            for (int x : a) minA = Math.min(minA, x);
            ans = Math.max(ans, a[n - 1] - minA);

            // Case 3: max(a[i+1] - a[i])
            //Xoay đoạn nhỏ nhất có thể để phần tử sau đưa lên trước → a[i+1] - a[i]
            for (int i = 0; i < n - 1; i++) {
                ans = Math.max(ans, a[i + 1] - a[i]);
            }

            System.out.println(ans);
        }
    }
}
