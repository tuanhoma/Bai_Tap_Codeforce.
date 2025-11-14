import java.util.Scanner;

public class A_Shortest_Path_with_Obstacle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            int b1 = sc.nextInt();
            int b2 = sc.nextInt();

            int f1 = sc.nextInt();
            int f2 = sc.nextInt();

            int dist = Math.abs(a1 - b1) + Math.abs(a2 - b2);
            // Case 1: Thẳng hàng theo cột (x)
            if (a1 == b1 && b1 == f1) {
                if (Math.min(a2, b2) < f2 && f2 < Math.max(a2, b2)) {// neéu vật chăn nằm giữa
                    dist += 2;
                }
            }

            // Case 2: Thẳng hàng theo hàng (y)
            if (a2 == b2 && b2 == f2) {
                if (Math.min(a1, b1) < f1 && f1 < Math.max(a1, b1)) {// nếu vật chặn nằm giữa
                    dist += 2;
                }
            }

            System.out.println(dist);
        }
    }
}
