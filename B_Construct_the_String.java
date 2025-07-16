import java.util.Scanner;
public class B_Construct_the_String {

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
            int b = sc.nextInt();
            int c = sc.nextInt();

            for(int i = 0, j = 97, k = 1; i < n; i++, j++, k++){
                char letter = (char) j;
                System.out.print(letter);
                if(k == c){
                    j = 96;
                    k = 0;
                }
            }
            System.out.println();
        }
    }
}
