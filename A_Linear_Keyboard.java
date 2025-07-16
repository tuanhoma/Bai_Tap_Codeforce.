import java.util.Scanner;

public class A_Linear_Keyboard {

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
            String line_1 = sc.nextLine();
            String line_2 = sc.nextLine();

            char[] a = line_1.toCharArray();
            char[] b = line_2.toCharArray();

            int[] result = new int[b.length];
            for(int i = 0, k = 0; i < b.length; i++, k++){
                int temp = i + 1;
                for(int j = 0; j < a.length; j++){
                    if(b[i] == a[j]){
                        result[k] = j;
                        break;
                    }
                }
            }

            int sum = 0;
            for(int i = 0; i < b.length - 1; i++){
                sum += Math.abs(result[i + 1] - result[i]);
            }

            System.out.println(sum);
        }
    }
}
