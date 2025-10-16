import java.util.Scanner;

public class B_Tournament {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                if(a[i] > max){
                    max = a[i];
                }
            }

            if((max == a[j - 1] && k == 1) || k >= 2){// nếu max là top 1 thì luôn là yes, hoặc nếu k >= 2 thì luôn yes vì số cần tìm luôn nằm trong top vì mỗi bước chọn 2 giá trị bất kì và bỏ đi thằng bé hơn hoặc bằng nên nếu k >= 2 thì số cần tìm luôn nằm trong top, cong k == 1 thì chỉ thằng lớn nhất mới ở top 1
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
