import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B_Team_Training {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            int count = 0;
            int tmp = 0;
            for(int i = n - 1; i >= 0; i--){
                if(a[i] >= x){
                    count++;
                }else{
                    tmp++;

                    if(tmp * a[i] >= x){
                        count++;
                        tmp = 0;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
