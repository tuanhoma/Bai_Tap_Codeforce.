import java.util.Scanner;

import static java.lang.Long.MAX_VALUE;

public class A_Lineland_Mail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            long max = -1;
            long min = MAX_VALUE;
            for(int j = 0; j < n; j++){
                if(a[j] != a[i]){
                    if(Math.abs(a[i] - a[j]) > max){
                        max = Math.abs(a[i] - a[j]);
                    }
                    if(Math.abs(a[i] - a[j]) < min){
                        min = Math.abs(a[i] - a[j]);
                    }
                }
            }
            System.out.println(min + " " + max);
        }

        sc.close();
    }
}
