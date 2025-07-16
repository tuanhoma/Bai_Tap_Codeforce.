
import java.util.Scanner;
public class A_Gennady_and_a_Card_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fisrt = sc.nextLine();
        char[] a = fisrt.toCharArray();

        String so1 = sc.nextLine();
        char[] so_1 = so1.toCharArray();

        for(int i = 0; i < so_1.length; i++){
            if(so_1[i] == a[0] || so_1[i] == a[1]){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
