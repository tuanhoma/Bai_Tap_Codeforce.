import java.util.Scanner;

public class C_Most_Similar_Words {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();

            String[] a = new String[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLine();
            }

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {// duyệt qua các kí tự ở mảng
                for (int j = i + 1; j < n; j++) {// so sánh với các ptu trong mảng
                    int count = 0;
                    for (int k = 0; k < m; k++) {// kiểm tra tưng cặp chuỗi và rồi kiểm tra kí tự của chúng
                        count += Math.abs(a[i].charAt(k) - a[j].charAt(k));
                    }
                    min = Math.min(min, count);
                }
            }

            System.out.println(min);
        }
    }
}
