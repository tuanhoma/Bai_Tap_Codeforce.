import java.util.Scanner;
public class A_Free_Ice_Cream {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextInt();
        long result = x;
        int count_childrent = 0;
        sc.nextLine();

        while (n-- > 0){
            String a = sc.next();
            char[] c = a.toCharArray();
            long b = sc.nextInt();
            sc.nextLine();

            if(c[0] == '+') {
                result += b;
            } else if (c[0] == '-' && result >= b){
                result -= b;
            } else if (result < b && c[0] == '-') {
                count_childrent++;
            }
        }

        System.out.println(result + " " + count_childrent);
    }
}
