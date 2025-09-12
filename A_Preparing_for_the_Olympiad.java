import java.util.Scanner;

public class A_Preparing_for_the_Olympiad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }


            int result = 0;
            for(int i = 0; i < n; i++){
                if(i == n - 1){// chỉ cần về cuối a[i] thì thằng b[i + 1] sẽ bị quá mảng ko thể có ptu nên ta sẽ cộng thẳng ptuwr cuỗi vào réult luôn mà ko cần trừa đi b[i]
                    result += a[i];
                }else if(a[i] - b[i + 1] >= 0){// nếu như a[i] - b[i + 1] mà > 0 thì cộng vào biến result, kiểu trừ chéo a[i] - b[i + 1]
                    result += a[i] - b[i + 1];
                }
            }

            System.out.println(result);
        }
    }

}
