import java.util.Scanner;

public class B_Sequence_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //input
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0){
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int count = 0;

            int hang_1 = 0;
            int hang_2 = 0;

            if(m >= a){
                hang_1 = m - a;
                count += a;
            } else {
                count += Math.min(a, m);
                hang_1 = m - a;
            }


            if(m >= b){
                hang_2 = m - b;
                count += b;
            } else {
                count += Math.min(b, m);
                hang_2 = m - b;
            }


            if(hang_1 >= 0){
                count += Math.min(hang_1, c);
                c -= hang_1;
            }
            if(hang_2 >= 0 && c >= 0){
                count += Math.min(hang_2, c);
            }
            System.out.println(count);
        }
    }
}
