import java.util.Scanner;


public class A_United_We_Stand {

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

            int[] b = new int[n];
            int[] c = new int[n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(a[i] % a[j] != 0){
                        b[i] = a[i];
                    }else{
                        c[i] = a[i];
                    }
                }
            }

            for (int i = 0; i < b.length; i++){
                System.out.print(b[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < c.length; i++){
                System.out.print(c[i] + " ");
            }
        }
    }
}
