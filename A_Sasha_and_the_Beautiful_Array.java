import java.util.Arrays;
import java.util.Scanner;

public class A_Sasha_and_the_Beautiful_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];

            for(int i = 0; i < n; i++ ){
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);// sắp xếp mảng
            long result = 0;
            for(int i = 0; i < n - 1; i++){
                result += a[i + 1] - a[i];// tổng tất cả hiệu của 2 ptu liền nhau, tổng của 2 cái trừ nhau sữ ra độ đẹp lớn nhất
            }

            System.out.println(result);
        }
    }
}
