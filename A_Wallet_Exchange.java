import java.util.Scanner;

public class A_Wallet_Exchange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int tmp = m + n;// nếu tổng số lượt đi của cả 2

            if(tmp % 2 == 0){// nếu tổng số lượt đi của cả 2 là chẵn thì bob luôn thắng
                System.out.println("Bob");
            }else{// nếu tổng lượt đi của cả 2 là lẻ thì alice thắng bởi vì alice đi trước
                System.out.println("Alice");
            }
        }

        sc.close();
    }
}
