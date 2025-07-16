import java.util.Scanner;
import java.util.Arrays;

public class C_Clock_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            boolean[] mark = new boolean[13]; // 1 to 12

            // Đảm bảo đoạn (a → b) đi theo chiều kim đồng hồ
            int start = a, end = b;
            while (start != end) {
                mark[start] = true;
                start++;
                if (start == 13) start = 1;// điều kiện làm vòng tròn kim đồng hồ tránh vượt quá 13
            }

            // Kiểm tra vị trí của c và d
            boolean inC = mark[c];
            boolean inD = mark[d];

            if (inC != inD) {// nếu 1 biến ở trong đoạn a -> b thì thành true nếu giữa 2 biến có 1 true ,1 false thì đúng in ra yes vì 1 trong 2 thằng thuộc đoạn đó và thằng còn lại ko thuộc
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
