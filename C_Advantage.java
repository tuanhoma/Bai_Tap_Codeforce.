import java.util.Scanner;
public class C_Advantage {

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
            int[] result = new int[n];

            int max = -1;
            int max1 = -1;
            int count = 0;

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                if(a[i] > max){
                    max = a[i];
                }
            }
            for(int i = 0; i < n; i++){
                if (a[i] != max && a[i] > max1) {
                    max1 = a[i];
                }
                if(a[i] == max){
                    count++;
                }
            }

            for(int i = 0; i < n; i++){
                if(a[i] < max || count > 1){
                    result[i] = a[i] - max;
                } else if (a[i] == max) {
                    result[i] = a[i] - max1;
                }
            }


            for (int i = 0; i < n; i++){
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }
}
