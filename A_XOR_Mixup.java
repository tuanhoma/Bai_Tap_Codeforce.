import java.util.Arrays;
import java.util.Scanner;

public class A_XOR_Mixup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);
            for(int i = 0; i < n; i++){
                int tmp = 0;
                for(int j = 0; j < n; j++){
                    if(i != j){
                        tmp ^= a[j];
                    }
                }

                if(tmp == a[i]){
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
}
