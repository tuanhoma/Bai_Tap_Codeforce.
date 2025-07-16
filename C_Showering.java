import javax.security.sasl.SaslClient;
import java.util.Map;
import java.util.Scanner;

public class C_Showering {

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
            int s = sc.nextInt();
            int m = sc.nextInt();

            int[][] a = new int[n][2];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < 2; j++){
                    a[i][j] = sc.nextInt();
                }
            }

            boolean found = false;
            for(int i = 0; i < n - 1; i++){
                for(int j = 1; j < 2; j++){
                    if(s <= Math.abs(a[i][1] - a[i + 1][0])){
                        found = true;
                    }
                }
            }

            if(a[0][0] - 0 >= s){
                found = true;
            }

            if(m - a[n - 1][1] >= s){
                found = true;
            }

            if(found){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
