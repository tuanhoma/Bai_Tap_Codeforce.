import java.util.Scanner;

public class A_And_Then_There_Were_K {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int power = 1;
            while (power * 2 <= n) {// soó nhân đôi liên tục và *2 phải bé hơn hoặc bằng n
                power *= 2;// gấp đổi liên tục
            }

            System.out.println(power - 1);
        }
    }
}
