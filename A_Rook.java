import java.util.Scanner;
public class A_Rook {

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

            int number = a[1] - '0';
            char kitu = 97;
            int j = 1;
            for(int i = 1; i <= 16; i++){
                String result_1 = kitu + "" + number;
                String result_2 = a[0] + "" + j;
                if(i <= 8){
                    if(!line.equals(result_1)){
                        System.out.println(kitu + "" + number);
                    }
                    kitu++;
                }else{
                    if(!line.equals(result_2)){
                        System.out.println(a[0] + "" + j);
                    }
                    j++;
                }
            }
        }
    }
}
