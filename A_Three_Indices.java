import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class A_Three_Indices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int max = 0;

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                if(a[i] > max){
                    max = a[i];
                }
            }

            //lưu biến index kết quả
            int result_i = 0;
            int result_j = 0;
            int result_k = 0;
            boolean found = false;
            for(int i = 1; i < n - 1; i++){

                int tmp_j = 0;
                int tmp_k = n - 1;// đặt làm giá trị ở cuỗi để tránh cùng trỏ về index 0 có giá trị bé nhất

                boolean found_j = false;
                boolean found_k = false;

                for(int j = 0, k = n - 1; ; ){
                    // dung để giữ lại index của các biến thỏa mã a[i] >
                    if(a[i] > a[j] && !found_j){
                        tmp_j = j;
                        found_j = true;
                    }
                    if(a[i] > a[k] && !found_k){
                        tmp_k = k;
                        found_k = true;
                    }

                    // so sánh xem thỏa mãn khi chèn các index ở trên vào chưa
                    if(a[i] > a[tmp_j] && a[i] > a[tmp_k]){
                        result_i = tmp_j + 1;
                        result_j = i + 1;
                        result_k = tmp_k + 1;
                        found = true;
                        break;
                    }

                    // cập nhật index đảm bao ko dc == i
                    if(j < i){
                        j++;
                    }
                    if(k > i){
                        k--;
                    }

                    // nếu cả 2 biến == i thì break vì ko tìm dc
                    if(j >= i && k <= i){
                        break;
                    }
                }
                if(found){
                    break;
                }
            }
            if(found){
                System.out.println("YES");
                System.out.println(result_i + " " + result_j + " " + result_k);
            }else{
                System.out.println("NO");
            }
        }
    }
}
