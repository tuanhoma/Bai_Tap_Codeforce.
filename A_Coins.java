import java.util.Scanner;

public class A_Coins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            boolean ok = false;
            int n = sc.nextInt();
            int k = sc.nextInt();

            // Duyệt y từ 0 đến min(1e6, n/k)
            for(long y = 0; y <= 1_000_000 && y * k <= n; y++){
                long remain = n - y * k;// y * k là số đồng k dc sử dụng, remain là số tiền còn dư sau khi trừ đi số đồng k dc sử dụng
                if(remain % 2 == 0){// nếu như số tiwwf còn dư sau khi trư đi số đồng k chia hết cho 2 để có số đồng 2 dc sử dụng là chẵn thì đúng còn ko thì sai
                    ok = true;
                    break;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}
