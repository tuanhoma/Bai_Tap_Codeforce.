import java.util.Scanner;

public class C_Make_Equal_Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Nếu toàn mảng đã bằng nhau
            boolean allEqual = true;
            for (int i = 1; i < n; i++) {
                if (a[i] != a[0]) {
                    allEqual = false;
                    break;
                }
            }
            if (allEqual) {
                System.out.println(0);
                continue;
            }

            // Đếm prefix = a[0], dò phần tử ở đầu xem liên tiếp dài đến đâu
            int prefix = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == a[0])
                    prefix++;
                else break;
            }

            // Đếm suffix = a[n-1], dò phần tử ở cuối xem lien tiếp dài đến đâu
            int suffix = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] == a[n - 1])
                    suffix++;
                else break;
            }

            int ans;
            if (a[0] == a[n - 1]) {// nếu đầu và cuỗi giống nhau thì đổi đoạn ở giữa
                // Nếu đầu và cuối cùng giá trị → chỉ cần đổi phần giữa
                ans = n - (prefix + suffix);
            } else {// chọn đầu hoặc cuỗi có chuỗi liên tiếp lớn nhất để đổi lại các ptu trong mảng ít nhất
                // Chọn phương án tốt hơn giữa giữ đầu hoặc giữ cuối
                ans = Math.min(n - prefix, n - suffix);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
