import java.util.Scanner;

import static java.lang.Math.ceil;

public class A_Park_Lighting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int totalCells = n * m;
            int result = (totalCells + 1) / 2; // Làm tròn lên
            System.out.println(result);
        }
        sc.close();
    }
}
