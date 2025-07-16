import java.util.Scanner;

public class A_Round_Down_the_Price {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long result = 0;

            for(double i = 0; ; i++){
                if(Math.pow(10, i) <= n){// thử từng mũ từ 0 đến n
                    result = n - (long)Math.pow(10, i);// nếu 10^0 thì bằng 1 vì số nào mũ 0 cùng đều bằng 1
                    // tìm ra kết quả bé nhất khi n - pow(10^i)
                }else{
                    break;
                }
            }

            System.out.println(result);
        }

        sc.close();
    }
}
