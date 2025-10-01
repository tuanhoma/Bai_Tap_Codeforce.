import java.util.Scanner;

public class B_The_Third_Side {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            long sum = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }

            // luôn chon x = ai + aj - 1 ở mỗi bước, thỏa mã tam giác ko suy biến tìm ra x lớn nhất sau n bước
            long result = sum - (n - 1);// tìm là x lớn nhất đó là mỗi lần gộp 2 ptu trong mảng rồi trừ đi 1 nên ta mới có công thức tổng tất cả rồi trừ đi số lần lặp lại (n - 1) sẽ ra kết quả
            System.out.println(result);
        }
    }
}
