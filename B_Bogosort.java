import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B_Bogosort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            Integer[] a = new Integer[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            Arrays.sort(a, Collections.reverseOrder());// sắp xếp mảng từ lớn đến bé sẽ luôn thỏa mãn i < j; j - a[j] != i - a[i]

            for(int i = 0; i < n; i++){
                System.out.print(a[i] + " ");
            }
        }
        sc.close();
    }
}
