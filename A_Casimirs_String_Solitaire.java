import java.util.Scanner;
public class A_Casimirs_String_Solitaire {

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

            int count = 0;
            int count_A = 0;
            int count_B = 0;
            int count_C = 0;
            for(int i = 0; i < line.length(); i++){
                count++;
                 if(a[i] == 'A'){
                     count_A++;
                 } else if (a[i] == 'B') {
                     count_B++;
                 }else{
                     count_C++;
                 }
            }

            int temp_B1 = count_B - count_C;
            int temp_B2 = count_B - count_A;
            if(count_A == count_B && count_A + count_B == count){
                System.out.println("YES");
            } else if (temp_B2 - count_C == 0) {
                System.out.println("YES");
            } else if (count_B == count_C && count_B + count_C == count) {
                System.out.println("YES");
            } else if (temp_B1 - count_A == 0) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
