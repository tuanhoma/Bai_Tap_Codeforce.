import java.util.Scanner;

import static java.lang.Math.ceil;

public class A_Desorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //input
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            boolean found = true;
            long min = 1000000;
            for(int i = 0; i < n - 1; i++){
                if(a[i] > a[i + 1]){
                    found = false;
                }
                if(a[i + 1] - a[i] < min){
                    min = a[i + 1] - a[i];
                }
            }

            double result;
            if(!found){
                System.out.println("0");
            }else{
                result = Math.ceil((double) (min + 1) / 2);
                System.out.println((long) result);
            }
        }
    }
}
