import java.util.Scanner;

public class B_Aleksa_and_Stack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            long tmp = 1;
            for(int i = 0; i < n; i++){
                System.out.print(tmp + " ");// dãy lẻ liên tục luôn đảm bảo thỏa mãn điều kiện
                tmp += 2;
            }
            System.out.println();
        }
    }
}
