import java.util.Scanner;

public class A_Vasya_and_Coins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //input
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0){
                System.out.println("1");
            } else {
                long result = a + 2 * b;
                System.out.println(result + 1);
            }
        }
    }
}
