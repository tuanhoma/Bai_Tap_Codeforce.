import java.util.Scanner;

public class B_Bobritto_Bandito {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            int l2 = Math.max(l, -m); // đảm bảo nằm trong [l,r] và đoạn chứa 0, vd nếu l = -3, -m = -2 thì m = 2
            // nếu l2 = -2, m = 2 do vậy luôn đảm bảo có 0 trong đoạn
            int r2 = l2 + m;

            System.out.println(l2 + " " + r2);
        }
    }
}
