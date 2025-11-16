import java.util.Scanner;

public class A_Collatz_Conjecture {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            for(int i = 0; i < n; i++){
                a *= 2;
            }

            System.out.println(a);
        }
    }
}
