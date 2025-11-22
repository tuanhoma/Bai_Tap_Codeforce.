import java.util.Scanner;

public class A_Payment_Without_Change {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            long n = sc.nextInt();
            long s = sc.nextInt();

            long x = Math.min(a, s / n);  // "số lượng" xu a có thể dùng nhiều nhất để gần với S, chỉ là số lượng số xu có a có giá trị n thôi, nếu như n > s thì đã dc tính n / s = 0, vì vd: 1 / 2 = 0 vì là chia nguyên
            long remain = s - x * n;      // số lượng xu b giá trị 1 cần để == s

            if(remain <= b){// nếu như số lượng xu giá trị 1 yêu cầu <= số lượng xu hiện có thì luôn in yes
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
