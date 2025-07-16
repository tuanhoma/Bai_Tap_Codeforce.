import java.util.Scanner;
public class A_Nastia_and_Nearly_Good_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //input
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0){
            long A = sc.nextLong();
            long B = sc.nextLong();

            long x = A;
            long z = A * (B + 1);
            long y = A * B;// A * b <=> z - x

            if(B == 1){
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(x + " " + y + " " + z);
            }
        }
    }
}
