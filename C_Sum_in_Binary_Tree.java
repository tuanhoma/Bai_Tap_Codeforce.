import java.util.Scanner;
public class C_Sum_in_Binary_Tree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();
            long result = 0;
            while(n > 0){
                result += n;// binary trê bằng cách dò ngược vd: n = 10, réult = n, réult += (n /= 2)
                //vd n = 10, 10 / 2 = 5, 5 / 2 = 2, 2/2 = 1, 1 /2 = 0; 10 + 5 + 2 + 1 = 18;
                n /= 2;
            }

            System.out.println(result);
        }
        sc.close();
    }
}
