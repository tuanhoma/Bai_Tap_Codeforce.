import java.util.Scanner;

public class B_Buttons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long sum = n;// đặt sum là các trường hợp đấn lần đầu

        for (long i = 1; i < n; i++) {
            sum += (n - i) * i;// là dò các bước còn lại n - 1 là số lần nhấn sai ở cac sbuowcs số lần nhấn ở bước n còn i là số lần đã nhấn đúng
        }

        System.out.println(sum);
        sc.close();
    }
}
