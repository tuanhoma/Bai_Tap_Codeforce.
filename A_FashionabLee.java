import java.util.Scanner;

public class A_FashionabLee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //input
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0){
            long n = sc.nextInt();
            if(n % 4 == 0){// Để đa giác đều có thể xoay sao cho 1 cạnh song song OX và 1 cạnh song song OY ⇒ số cạnh phải chia hết cho 4.
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
