import java.util.Scanner;

public class B_Bad_Boy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int i = sc.nextInt();
            int j = sc.nextInt();
            /*khoảng cách từ (i,j) đến yo-yo 1
             + khoảng cách từ yo-yo 1 đến yo-yo 2
             + khoảng cách từ yo-yo 2 quay về (i,j)*/
            /* Trong hình chữ nhật, hai điểm xa nhau nhất luôn là hai góc chéo nhau.
               (1,1) và (n,m)
               (1,m) và (n,1)*/


            // Hai cặp góc: (1,1)-(n,m) và (1,m)-(n,1)
            int d1 = dist(i, j, 1, 1) + dist(1, 1, n, m) + dist(n, m, i, j);// là tổng quảng đường nếu để mỗi yo - yo ở 2 góc chéo nhau của hình
            int d2 = dist(i, j, 1, m) + dist(1, m, n, 1) + dist(n, 1, i, j);// là tổng quãng đường nếu đi từ vị trí nhân vật đến cột lớn nhất (1, m) và rồi đi đến vị trị cuối của hàng (n, 1)
            //dist(i, j, 1, 1) khoảng cách giữa nhân vật và cột 1 và hàng 1
            //dist(1, 1, n, m) khoảng cách giữa 1 và m, n
            //dist(n, m, i, j) khảng cách giữa nhân vật ở vị trí i, j và vị trí cuối cùng m, n

            if (d1 >= d2) {// nếu tổng quãng đường đi chéo từ góc chéo này đến góc chéo khác của hình lớn hơn đi từ vị trí ban đầu đến cuối hàng (m, 1) và cuỗi cột (n, 1)
                System.out.println("1 1 " + n + " " + m);
            } else {
                System.out.println("1 " + m + " " + n + " 1");
            }
        }
    }

    // Tính khoảng cách Manhattan giữa 2 điểm
    static int dist(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}
