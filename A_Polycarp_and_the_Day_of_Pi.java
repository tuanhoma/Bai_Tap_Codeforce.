import java.util.Scanner;
public class A_Polycarp_and_the_Day_of_Pi {

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

            String tamp = "314159265358979323846264338327";
            char[] b = tamp.toCharArray();

            int count = 0;
            for(int i = 0; i < a.length; i++){
                if(a[i] == b[i]){
                    count++;
                }else{
                    break;
                }
            }
            System.out.println(count);
        }

    }
}
