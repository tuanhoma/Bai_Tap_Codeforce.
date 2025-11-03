import java.util.Scanner;

public class A_AvtoBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            if (n % 2 != 0 || n < 4) {// nếu như n là lẻ hoặc là n < 4 thì luôn ko có cách để tính ra số xe, nó sẽ khiến số lượng xe ko dc hợp lý
                System.out.println(-1);
                continue;
            }

            // số xe nhỏ nhất (n + 5) / 6 sẽ lấy dc số xe nhỏ nhất nếu dư sẽ dc làm tròn lên chuẩn nhất
            long min = (n + 5) / 6; // <=> (long)Math.ceil(n / 6.0) nhưng vì đang chia một số rất lớn nên phải để (n + 5) / 6 để làm trong chuẩn nhất, nếu để cail chia double thì sẽ lỗi vì kiểu double ko thể để số lớn như vậy chia dc sẽ khiến sai lệch rất nhiều
            // số xe lớn nhất
            long max = n / 4;// là n / 4 sẽ lấy dc số xe lớn nhất

            System.out.println(min + " " + max);
        }
    }
}
