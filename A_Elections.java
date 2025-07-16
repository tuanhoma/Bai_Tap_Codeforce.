import java.util.Scanner;
public class A_Elections {

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
            int c = sc.nextInt();

            int temp = a > b ? a : b;
            int max = (temp > c ? temp : c);

            int result_a = 0;
            int result_b = 0;
            int result_c = 0;
            if(a > b && a > c){
                result_a = 0;
            }else{
                result_a = (max - a) + 1;
            }


            if(b > c && b > a){
                result_b = 0;
            }else{
                result_b = (max - b) + 1;
            }


            if(c > a && c > b){
                result_c = 0;
            }else{
                result_c = (max - c) + 1;
            }

            System.out.println(result_a + " " + result_b + " " + result_c);
        }
    }
}
