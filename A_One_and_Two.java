import java.util.Scanner;

public class A_One_and_Two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //input
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            int min = -1;
            for(int k = 1; k < n; k++){// vị trí của k hiện tại để phân chia trái và phải

                long temp = 1;
                for(int i = 0; i < k; i++){// tìm bên trái trước, tích của các ptử trước k (k là ranh giới)
                    temp *= a[i];
                }

                long tamp = 1;
                for(int j = k; j < n; j++){// tìm bên phải bắt đầu từ k đến cuối
                    tamp *= a[j];
                }

                if(temp == tamp){// so sánh 2 biến tổng tích vs nhau
                    min = k;
                    break; // tìm min nên dừng ngay
                }
            }
            System.out.println(min);
        }
    }
}
