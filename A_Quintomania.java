import java.util.Scanner;

public class A_Quintomania {

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
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            boolean found = false;
            for(int i = 0; i < n - 1; i++){
                int temp = Math.abs(a[i] - a[i + 1]);
                if(temp != 5 && temp != 7){
                    found = true;
                    break;
                }
            }

            if(found) {
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
