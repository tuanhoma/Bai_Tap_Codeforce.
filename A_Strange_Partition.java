import java.util.Scanner;

public class A_Strange_Partition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];

            long max = 0;
            long min = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                min += (long)Math.ceil((double)a[i] / x);// mỗi bước chia ptu cho x rồi lấy trần của nó cộng vào biến min
                max += a[i];
            }

            max = (long)Math.ceil((double)max / x);// tổng tất cả ptu rồi chia cho x rồi lấy trần là ra max


            System.out.println(min + " " + max);

        }
    }
}
