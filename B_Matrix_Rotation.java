import java.util.Scanner;

public class B_Matrix_Rotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            // hàng 1
            int a = sc.nextInt();
            int b = sc.nextInt();

            // hàng 2
            int c = sc.nextInt();
            int d = sc.nextInt();

            // nếu hàng 1 và hàng 2 giống nhau cột 1 của 2 hàng cùng lớn hơn hoặc bé hon cột 2 của cả 2 hàng thì luôn đảm bảo thỏa mãn bài và in YES, nếu ko thì in no
            if(a > b && c > d){// nếu a > b thì và c > d thì luôn đảm bảo thỏa mãn,
                System.out.println("YES");
            }else if(a < b && c < d){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
