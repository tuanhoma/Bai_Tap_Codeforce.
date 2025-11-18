import java.util.Scanner;

public class A_Frog_Jumping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long k = sc.nextLong();

            long tmp = (long)Math.ceil((double)k / 2);// lấy số lượng bước nhảy có số lẻ
            long tmp_a = a * tmp;
            long tmp_b = b * (k - tmp);// (k - tmp) là số bước nhảy chẵn còn lại
            long result = tmp_a - tmp_b;

            System.out.println(result);
        }
    }
}
