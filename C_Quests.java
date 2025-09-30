import java.util.Scanner;

public class C_Quests {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }

            long sumA = 0;
            int maxB = 0;
            long ans = 0;

            int upto = Math.min(n, k);// lấy đoạn nhỏ nhất có thể đi, nếu n < k thì đi hết n là giới hạn, nếu k > n thì đi từ 0 đến k là giới hạn
            for(int m = 0; m < upto; m++){// dò từng ptu để xem
                sumA += a[m];// cổng từng ptu vào tổng trong từng bước
                maxB = Math.max(maxB, b[m]);// chọn b[i] max trong đoạn dò
                long total = sumA + (long)(k - (m + 1)) * maxB;// tính tổng bằng các bước lấy tổng + với số bước còn thừa nhân với b[i] lớn nhất còn lại trong mảng
                ans = Math.max(ans, total);// lấy ra tổng lớn nhất trong các trường hợp
            }
            System.out.println(ans);
        }
    }
}
