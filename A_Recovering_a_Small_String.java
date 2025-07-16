import java.util.Scanner;
public class A_Recovering_a_Small_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // số test case

        while (t-- > 0) {
            int n = sc.nextInt();  // giá trị tổng cần đạt
            String answer = "zzz"; // khởi tạo từ lớn nhất để so sánh

            for (int i = 1; i <= 26; i++) {         // chữ cái đầu tiên
                for (int j = 1; j <= 26; j++) {     // chữ cái thứ hai
                    int k = n - i - j;              // chữ cái thứ ba
                    if (k >= 1 && k <= 26) {
                        String word = "" + (char)('a' + i - 1) + (char)('a' + j - 1) + (char)('a' + k - 1);
                        // không có từ nào lớn hon"zzz" nên so sánh để đảm bảo kq luôn đúng
                        if (word.compareTo(answer) < 0) {// Nếu word nhỏ hơn từ answer theo thứ tự từ điển → cập nhật
                            answer = word;
                        }
                    }
                }
            }

            System.out.println(answer);
        }
    }
}
