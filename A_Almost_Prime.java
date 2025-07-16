import java.util.Scanner;

public class A_Almost_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {// i sẽ là kết quả của 2 số nto nhân với nhau, kiểm tra i có đúng ko
            if (countDistinctPrimeFactors(i) == 2) {// nếu như có hai số nguyên tố khác nhau thì count++ đúng là i có 2 thừa số nt nhân với nhau ra i
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }

    // Đếm số thừa số nguyên tố phân biệt
    public static int countDistinctPrimeFactors(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {// n % i == 0 → tức là i chia hết n, nghĩa là i là thừa số của n
                // isPrime(i) → kiểm tra i có phải là số nguyên tố
                count++;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        return count;
    }

    // Kiểm tra nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
