import java.util.Scanner;

public class A_Light_Out {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] press = new int[3][3];   // số lần nhấn
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                press[i][j] = sc.nextInt();
            }
        }

        int[][] result = new int[3][3];

        // 4 hướng di chuyển: trên, dưới, trái, phải
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // duyệt qua từng bóng đèn
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int sum = press[i][j]; // số lần nhấn chính nó

                // cộng thêm số lần nhấn từ hàng xóm
                for (int k = 0; k < 4; k++) {
                    int ni = i + dx[k];
                    int nj = j + dy[k];
                    if (ni >= 0 && ni < 3 && nj >= 0 && nj < 3) {
                        sum += press[ni][nj];
                    }
                }

                // ban đầu = 1 (sáng), nên trạng thái = (1 + sum) % 2
                result[i][j] = (1 + sum) % 2;
            }
        }

        // in kết quả
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
