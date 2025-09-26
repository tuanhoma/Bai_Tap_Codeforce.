import java.util.Scanner;

public class A_XORwice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long a = sc.nextInt();
            long b = sc.nextInt();

            long x = a | b; // chọn x = a OR b, phép OR là phép toán logic theo từng bit. giống như || nhưng chỉ dùng để XOR bit
            long result = (a ^ x) + (b ^ x);// x = a OR b luôn ra số nhỏ nhất

            System.out.println(result);
        }
    }
}
