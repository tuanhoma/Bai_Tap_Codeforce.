import java.util.Scanner;

public class A_Odd_Selection {

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
            int x = sc.nextInt();
            int[] a = new int[n];

            int count_odd = 0;
            int count_even = 0;
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] % 2 != 0) {
                    count_odd++;
                } else {
                    count_even++;
                }
            }

            boolean found = false;
            // Duyệt số lượng số lẻ sẽ chọn (phải là số lẻ), từ 1 đến x
            for (int odd = 1; odd <= Math.min(count_odd, x); odd += 2) {
                int even = x - odd;// số lượng chẵn = x - số lượng lẻ vì odd += 2;
                if (even <= count_even) {// xem thỏa mãn even chưa vì chỉ luôn lấy số lượng số lẻ là lẻ nên luôn thỏa mãn
                    found = true;
                    break;
                }
            }

            System.out.println(found ? "YES" : "NO");
        }
    }
}

