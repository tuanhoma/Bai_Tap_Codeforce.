import java.util.Scanner;

public class F_Eating_Candies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            int r = n - 1;
            int l = 0;


            int tmp_r = a[r];
            int tmp_l = a[l];

            int result = 0;
            while(l < r){
                if(tmp_l < tmp_r){
                    l++;
                    tmp_l += a[l];
                }else if(tmp_r < tmp_l){
                    r--;
                    tmp_r += a[r];
                }else{
                    // sumL == sumR
                    // vì bắt đầu từ index 0 nên, (l + 1) là số kẹo alice ăn, (n - r) là số kẹo bob ăn
                    result = (l + 1) + (n - r);// là số kẹo cả hai đã ăn
                    l++;// cập nhật index l để tránh lặp vô hạn
                    if (l < r) {// kiểm tra đảm bảo l < r sau khi cập nhật để thêm giá trị vào biến Suml
                        tmp_l += a[l];// thêm giá trị vào biến Suml để vòng lặp sau kt tiếp
                    }
                }
            }

            System.out.println(result);
        }
    }
}
