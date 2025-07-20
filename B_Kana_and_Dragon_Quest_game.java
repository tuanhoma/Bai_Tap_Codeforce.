import java.util.Scanner;

public class B_Kana_and_Dragon_Quest_game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt(); // máu rồng
            int n = sc.nextInt(); // số lần Void Absorption
            int m = sc.nextInt(); // số lần Lightning Strike

            // Dùng Void Absorption miễn là còn và có tác dụng đáng kể (x >= 20)
            while(n > 0 && x >= 20){// dùng hết số lần Void Absorption khi máu rồng trên 20, nếu còn số lần phép nhưng máu rồng dưới 20 thì ko dc dùng
                x = (x / 2) + 10;
                n--;
            }

            // Sau đó dùng hết Lightning Strike
            x -= 10 * m;

            // Kết quả
            if(x <= 0){// nếu như sau khi dùng hết phép nếu như < 0 thì đúng còn ko thì sai
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
