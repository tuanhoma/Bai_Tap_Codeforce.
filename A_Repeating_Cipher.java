import java.util.Scanner;

public class A_Repeating_Cipher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String line = sc.nextLine();
        String result = "";
        int sum = 0;// biến tổng làm index để lấy kí tự cần thiết
        int i = 1;// biến cộng vào tổng
        while(sum < n){// đảm báo ko truy cập quá
            result += line.charAt(sum);
            sum += i;// tính tổng
            i++;// cập nhật biến tính tổng
        }

        System.out.println(result);
    }
}
