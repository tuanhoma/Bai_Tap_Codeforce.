import java.util.Scanner;

public class B_Omkar_and_Last_Class_of_Math {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextInt();
            if(n % 2 == 0){// nếu n là chẵn thì a == b == n / 2 sẽ luôn ra bội chung nhỉ nhất LCM
                System.out.println((n / 2) + " " + (n / 2));
            }else{//

                // tìm ước của n
                long divisor = -1;
                for (long i = 2; i * i <= n; i++) {
                    if (n % i == 0) {// duyệt để tìm ước bé nhất của n rồi a = n / ước vì a là chia cho ước bé nhất rồi nên ta ta có thể dò số bội chia cho a nhỏ nhất đó sẽ ra bội nhỏ nhất
                        divisor = i;
                        break;
                    }
                }

                if (divisor == -1) {// nếu duyệt qua hết mà divisor vẫn là -1 thì n là số nguyên tố ko thể chia cho cái gì
                    // n là số nguyên tố
                    System.out.println("1 " + (n - 1));
                } else {
                    long a = n / divisor;// a = n / (ước của n)divisor, vì a = n đã chia cho ước của nó
                    long b = n - a;// b = phần còn lại của n
                    System.out.println(a + " " + b);// sẽ ra LCM nhỏ nhất
                }
            }
        }

    }

    // phần thuật logic đúng nhưng ko tối ưu
        /*while(t-- > 0){
            int n = sc.nextInt();
            long a = (int)Math.floor((double)n / 2);
            long b = (int)Math.ceil((double)n / 2 );

            long min = Long.MAX_VALUE;
            long result_a = 0;
            long result_b = 0;
            while(a != 0) {
                long LCM = (a * b) / GCD(a, b);
                if (LCM < min) {
                    min = LCM;
                    result_a = a;
                    result_b = b;
                }
                a--;
                b++;
            }

            System.out.println(result_a + " " + result_b);
        }*/

    /*public static long GCD(long a, long b){
        while(b != 0){
            long tmp = a % b;
            a = b;

            b = tmp;
        }

        return a;
    }*/

}