import java.util.Map;
import java.util.Scanner;

public class A_Im_bored_with_life {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int tmp = Math.min(a, b);// tìm min giữa a và b
        int result = 1;// biến lưu kết quả giai thừa của min(a, b)
        for(int i = 1; i <= tmp && i <= 12; i++){// bắt buộ tính giai thừa kết quả chỉ dưới khoảng 12 giai thừa
            result *= i;
        }

        System.out.println(result);// là giai thừa của min(a. b) hay là gcd(a, b)
    }

}
