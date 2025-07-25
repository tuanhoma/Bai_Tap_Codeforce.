import java.util.Scanner;

public class A_Juicer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int sum = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(a[i] <= b){
                sum += a[i];
                if(sum > d){
                    count++;
                    sum = 0;
                }
            }
        }

        System.out.println(count);
    }
}
