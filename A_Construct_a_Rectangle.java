import java.util.Scanner;

public class A_Construct_a_Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long l1 = sc.nextLong();
            long l2 = sc.nextLong();
            long l3 = sc.nextLong();

            boolean ok = false;

            // Case 1: nếu như 2 que bằng nhau và 1 que còn lại là chẵn thì luôn đúng
            if (l1 == l2 && l3 % 2 == 0) ok = true;
            if (l1 == l3 && l2 % 2 == 0) ok = true;
            if (l2 == l3 && l1 % 2 == 0) ok = true;

            // Case 2: nếu như có một que bằng tổng 2 que còn lại thì cũng luôn đúng vd: 2 + 3 + 5 <=> 5 = 2 + 3 => 3 + 2 + 2 + 3 luôn có thể làm thành hình vuông hoặc chữ nhật
            if (l1 == l2 + l3) ok = true;
            if (l2 == l1 + l3) ok = true;
            if (l3 == l1 + l2) ok = true;

            System.out.println(ok ? "YES" : "NO");
        }
    }
}
