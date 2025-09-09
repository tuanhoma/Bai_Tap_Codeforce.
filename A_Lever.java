import java.util.Scanner;

public class A_Lever {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }

            int result = 1;// luôn cần 1 vòng lạp cuối để kiểm tra, gọi là vòng lặp kiểm tra xem có nên thoát hay ko nên luôn là 1 vòng lặp
            for(int i = 0; i < n; i++){
                if(a[i] > b[i]){// kiểm tra từng vị trí của cả hai mảng và nếu a[i] > b[i] thì cần số lặp tương tự a[i] - b[i] để giảm a[i] == b[i] chỉ ở vị trí đó chứ ko phải tất cả phần tủ trong mảng nên nếu như còn các ptu khác cũng có a[i] > b[i] thì vẫn cần số lặp tương đương để giảm ở vị trí ptu đó
                    result += a[i] - b[i];
                }
            }

            System.out.println(result);
        }
    }
}
