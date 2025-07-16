import java.util.Scanner;
public class B_Same_Parity_Summands {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0){
                    a[i][j] = 1;
                }else{
                    a[i][j] = a[i - 1][j] + a[i][j - 1];
                }
                if(a[i][j] > max){
                    max = a[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
