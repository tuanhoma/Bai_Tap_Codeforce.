import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_Everybody_Likes_Good_Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            int count = 0;
            for(int i = 0; i < n - 1; i++){
                if((a[i] % 2 == 0 && a[i + 1] % 2 == 0) || (a[i] % 2 != 0 && a[i + 1] % 2 != 0)){// nếu như 2 ptu liên tiếp cùng lẻ hoặc cùng chẵn thì biến count sẽ tăng lên 1 là số ptu cần xóa để mảng là good
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
