import java.util.Scanner;
public class B_Same_Parity_Summands1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            if((n >= k) && (n - k) % 2 == 0){
                System.out.println("YES");
                for (int i = 0; i < k - 1; i++) {
                    System.out.print("1 ");
                }
                System.out.println(n - (k - 1));
            }else if((n >= 2*k) && (n - 2 * k) % 2 == 0){
                System.out.println("YES");
                for (int i = 0; i < k - 1; i++) {
                    System.out.print("2 ");
                }
                System.out.println(n - 2 * (k - 1));
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
