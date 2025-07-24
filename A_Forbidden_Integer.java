import java.util.*;

public class A_Forbidden_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // số lượng test case

        while (t-- > 0) {
            int n = sc.nextInt();  // tổng cần đạt được
            int k = sc.nextInt();  // số lớn nhất được dùng
            int x = sc.nextInt();  // số bị cấm

            // Tạo danh sách các số hợp lệ (trừ x)
            List<Integer> valid = new ArrayList<>();
            for (int i = 1; i <= k; i++) {
                if (i != x) {
                    valid.add(i);
                }
            }

            List<Integer> result = new ArrayList<>();
            int sum = 0;
            boolean found = false;

            // Duyệt từ số nhỏ nhất → ưu tiên số lặp lại được nhiều lần
            int i = 0;
            while (sum < n && i < valid.size()) {
                int num = valid.get(i);
                while (sum + num <= n) {
                    result.add(num);
                    sum += num;
                }
                i++;
            }

            if (sum == n) {
                System.out.println("YES");
                System.out.println(result.size());
                for (int v : result) {
                    System.out.print(v + " ");
                }
                System.out.println();
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
