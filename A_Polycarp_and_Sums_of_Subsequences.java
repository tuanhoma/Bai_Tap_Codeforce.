import java.util.Scanner;

public class A_Polycarp_and_Sums_of_Subsequences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long[] a = new long[7];
            for(int i = 0; i < 7; i++){
                a[i] = sc.nextLong();
            }

            long x = a[0];// dịch nguọc lại về giá trị ỏ vị trí 1 của tập cha
            long y = a[1];// dịch nguọc về giá trị ỏ vị 2 của tập cha
            long z = a[6] - a[0] - a[1];// dịch nguọc lại giá trị vị trí thú 3 cuối cùng của tập cha, giá trị thú 7 của tập con dịch nguọc lại thành vị trí thú 3 của tập cha

            System.out.println(x + " " + y + " " + z);
        }
    }
}
