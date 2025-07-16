import java.util.Scanner;

public class Random_Teams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int x = n / m;
        int r = n % m;
        int temp = n - m + 1;

        int kmin = (m - r) * ((x*(x - 1) / 2)) + r * ((x + 1) * x / 2);
        int kmax = ((temp * (temp - 1))/2);

        System.out.print(kmin + " " + kmax);
    }
}
