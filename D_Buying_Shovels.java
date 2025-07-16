import java.util.Scanner;

public class D_Buying_Shovels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextInt();
            long k = sc.nextInt();
            long ans = n;// tối đa là n gói loại 1

            long sum = 0;
            long count = 0;
            for(long i = 1; i * i <= n; i++){
                if(n % i == 0){// các ước của nó là các số sngr tối ưu cần mua
                    // i là ước của n
                    if(i <= k){
                        ans = Math.min(ans, n / i);// số gói cần mua ít nhất sau khi n / số sẻng
                    }
                    // n / i cũng là ước của n
                    if(n / i <= k){
                        ans = Math.min(ans, i);// số gói cần mua ít nhất sau khi n / số sẻng
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
