import java.util.Scanner;

public class B_Friends_and_Candies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            long sum = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }

            if(sum % n == 0){
                int count = 0;
                long tmp = sum / n;
                for(int i = 0; i < n; i++){
                    if(a[i] > tmp){
                        count++;
                    }
                }
                System.out.println(count);
            }else{
                System.out.println("-1");
            }
        }
    }
}
