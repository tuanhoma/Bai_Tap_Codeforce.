import java.util.Scanner;
public class A_Trippi_Troppi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        //input
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0){
            String line = sc.nextLine();
            char[] a = line.toCharArray();

            System.out.print(a[0]);
            for(int i = 0; i < a.length; i++){
                if(a[i] == ' '){
                    System.out.print(a[i + 1]);
                }
            }
            System.out.println();
        }
    }
}
