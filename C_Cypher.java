import java.util.Scanner;

public class C_Cypher {

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
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                int tamp = a[i];
                int temp = sc.nextInt();
                String line = sc.next();
                char[] b = line.toCharArray();
                for(int j = 0; j < b.length; j++){
                    // mặc dù đề bài có ghi là D là -1 và U là +1
                    //nhưng vì là đang mã hóa nên D là +1 và U là -1 dịch ngược lại
                    if(b[j] == 'U'){
                        tamp -= 1;
                        if(tamp < 0){
                            tamp += 10;
                        }
                    }else{
                        tamp += 1;
                        if(tamp > 9){
                            tamp = tamp - 10;
                        }
                    }
                }
                a[i] = tamp;
            }

            for(int i = 0; i < n; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
