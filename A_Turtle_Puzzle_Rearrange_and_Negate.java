import java.util.Scanner;
public class A_Turtle_Puzzle_Rearrange_and_Negate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //input
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += Math.abs(a[i]);
            }
            System.out.println(sum);
        }
    }
}
