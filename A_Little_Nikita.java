import java.util.Scanner;

public class A_Little_Nikita {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            if(n >= m && (n - m) % 2 == 0){/* ta phải thực hiện hết n bước làm sao để đạt dc m,
             nếu như đạt trc m trước khi hết n bước thì phải cộng trừ để giữ nguyên giá trị,
             nếu như bước thì ra là lẻ thì ko giữ nguyên dc giá trị m, còn chẵn thì giữ nguyên được
             tức hiệu giữa (n - m) phải chia hết cho 2)*/
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
