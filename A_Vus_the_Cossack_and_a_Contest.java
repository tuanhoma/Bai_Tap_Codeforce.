import java.util.Scanner;
public class A_Vus_the_Cossack_and_a_Contest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        if(m >= n && k >= n){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
