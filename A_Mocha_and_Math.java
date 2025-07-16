import java.util.Scanner;

public class A_Mocha_and_Math {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            int result = a[0];// result = a[0] & từ (1 -> n - 1) sẽ ra kết quả bé nhất
            for(int i = 1; i < n; i++){
                result = result & a[i];
            }

            System.out.println(result);
        }
    }
}
