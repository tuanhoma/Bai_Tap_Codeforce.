import java.util.Scanner;

public class A_New_World_New_Me_New_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //input
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();
            int temp = Math.abs(k);

            int sum = 0;
            int count = 0;
            for(int i = 0; i < n; i++){
                if(sum < temp){
                    sum += p;
                    count++;
                }

                if(sum >= temp){
                    break;
                }
            }

            if(sum >= temp){
                System.out.println(count);
            }else{
                System.out.println("-1");
            }
        }
    }
}
