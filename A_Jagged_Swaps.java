import java.util.Scanner;

public class A_Jagged_Swaps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            boolean found = false;
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            for(int i = 1; i < n - 1; i++){
                if(a[i] > a[i - 1] && a[i] > a[i + 1]){
                    found = true;
                }
            }

            if(found){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
