import java.util.Scanner;

public class A_Rudolph_and_Cut_the_Rope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int count = 0;
            for(int i = 0; i < n; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(a - b > 0){// tìm nếu như a - b > 0 thì count++, vì nếu như điểm đó trừ đi độ dài dây nó luôn > 0 thì nó ko bao giờ chạm đất được nên ta sẽ phải cắt dây đó nên biến count sẽ được cộng
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
