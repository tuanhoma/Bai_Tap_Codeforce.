import java.util.Scanner;

public class A_2_3_Moves {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int count = 0;
            if (n == 1) {
                count = 2;
            } else {
                count = (n + 2) / 3; // vì lấy trần của n/3 luôn ra được trường hợp thỏa mãn mà ko cần điều kiện chia 2
                // Công thức này hoạt động vì việc cộng thêm 2 rồi chia 3 sẽ tự động làm tròn lên khi n có dư là 1 hoặc 2, đúng như quy tắc tối ưu của ta vd (3 + 2) / 3 = trần ceil(1.6) = 2 bước thỏa mãn
            }
            System.out.println(count);
        }
    }
}
