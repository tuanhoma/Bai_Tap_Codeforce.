import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class B_Mahmoud_and_a_Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        // tam giác không suy biến là nếu như a <= b <= c thì chỉ cần xét nếu a + b > c thì là tam giác ko suy biến

        Arrays.sort(a);// sắp xếp từ bé đến lớn để sét a + b > c có thỏa mãn ko

        for(int i = 1; i < n - 1; i++){// xét xem a + b > c có thỏa mãn ko
            if(a[i - 1] + a[i] > a[i + 1]){
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
