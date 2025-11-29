import java.util.Scanner;

public class B_Plus_Minus_Split {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String line = sc.nextLine();

            int count_plus = 0;
            int count_minus = 0;
            for(int i = 0; i < n; i++){
                if(line.charAt(i) == '+'){
                    count_plus++;
                }else{
                    count_minus++;
                }
            }

            int result = Math.abs(count_plus - count_minus);
            System.out.println(result);
        }
    }
}
