import java.util.Scanner;

public class A_Brick_Wall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int result = n * (int)Math.floor((double)m / 2);
            // (int)Math.floor((double)m / 2) là số gạch tối ưu nhất có thể lắp đầy hết 1 hàng khi đặt ngang mà ko phải đtawj dọc vì khi đặt dọc, số gạch đặt ngang sẽ phải trừ đi số gạch dọc, nên floor(m/2) sẽ là số găchj đtawj ngang nhiều nhất có thể lắp đầy 1 hàng
            // n * (int)Math.floor((double)m / 2) là số lượng hàng cần đặt gạch nhân với số lượng gạch đtawj ngang lấp đầy 1 hàng mà ko cần phải đặt dọc
            // nên sẽ có được số lượng gạch nhiều nhất mà ko cần trừ gì hết;
            System.out.println(result);
        }
    }
}
