import java.util.Scanner;
public class C_Vasilije_in_Cacak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //input
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();

            long min_sum = (k *(k + 1)) / 2;
            long max_sum = (k*(2*n - k + 1)) / 2;

            if(x <= max_sum && x >= min_sum){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
