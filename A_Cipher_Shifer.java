import java.util.Scanner;

public class A_Cipher_Shifer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();// đọc n
            String s = sc.nextLine();

            StringBuilder result = new StringBuilder();// dùng StringBuilder để tối ưu việc nối chuỗi
            int i = 0;

            while (i < n) {
                char current = s.charAt(i);// biến nhớ tạm kí tự tại vị trí của index i
                int j = i + 1;

                while (j < n && s.charAt(j) != current) {
                    j++;// bỏ qua các ký tự khác current
                }

                if (j < n) {
                    result.append(current);// thêm ký tự gốc vào kết quả
                    i = j + 1; // bỏ qua cặp đã xử lý duyệt và kiểm tra bằng cách gán i = j + 1, đi tiếp từ đoạn j + 1
                } else {
                    break;// nếu không tìm thấy thì dừng
                }
            }

            System.out.println(result.toString());
        }
    }
}
