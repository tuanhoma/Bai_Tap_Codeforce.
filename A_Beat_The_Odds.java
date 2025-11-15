import java.util.Scanner;

public class A_Beat_The_Odds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int count_odd = 0;
            int count_even = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                if(a[i] % 2 == 0){
                    count_even++;
                }else{
                    count_odd++;
                }
            }

            int result = Math.min(count_odd, count_even);// nếu trong mảng có thằng lẻ hoạc chẵn ít hơn thì chọn thằng ít nhất để làm cho mảng luôn chẵn khi cộng liên tiếp
            System.out.println(result);
        }
    }
}
