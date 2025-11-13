import java.util.Scanner;

public class C_Sending_Messages {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            long f = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();

            long[] arr = new long[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }

            long tmp = 0;
            if(arr[0] * a > b){
                tmp = b;
            }else{
                tmp = arr[0] * a;
            }

            for(int i = 0; i < n - 1; i++){
                if((arr[i + 1] - arr[i]) * a > b){
                    tmp += b;
                }else{
                    tmp += (arr[i + 1] - arr[i]) * a;
                }
            }

            if(tmp >= f){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
