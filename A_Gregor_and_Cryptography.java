import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class A_Gregor_and_Cryptography {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println("2" + " " + (n - 1));
            // n - 1 là số nguyên tố lẻ đó trừ 1, n - 1
            // mà số lẻ n mod (n - 1) luôn dư 1 vì nó đang chia chính nó trừ đi 1
            // vì số lẻ n mod 2 luôn dư 1
            // và số đó n mod (n - 1) cũng luôn dư 1 vì nó chia chính nó trừ đi 1 phần tử
        }
    }
}
