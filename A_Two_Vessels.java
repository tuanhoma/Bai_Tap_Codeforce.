import java.util.Scanner;

public class A_Two_Vessels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int diff = Math.abs(a - b);// abs la gia tri tuyet doi
            double halfDiff = diff / 2.0;// cho halfdiff thanh so thuc
            int moves = (int) Math.ceil(halfDiff / c);// làm tròn lên bằng ceil rồi ép thành số nguyên

            System.out.println(moves);
        }
        sc.close();
    }
}
