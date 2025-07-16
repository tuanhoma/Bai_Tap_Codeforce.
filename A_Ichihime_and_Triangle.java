import java.util.Scanner;
public class A_Ichihime_and_Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //ibput
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int x = b;
            int y = c;
            int z = c;

            System.out.println(a + " " + b + " " + c);
        }
    }
}
