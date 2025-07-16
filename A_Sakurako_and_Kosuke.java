import java.util.Scanner;

public class A_Sakurako_and_Kosuke {

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
            // vì đề bài xuất phát từ 0 với Sakuro mà mỗi lần kết quả sẽ là (2 * n) - 1
            // nên nếu ;ần di chuyển là chẵn thì sakuro luôn thắng
            if(n % 2 == 0){
                System.out.println("Sakurako");
            }else{
                // nếu lần di chuyển lẻ thì kóuke luôn thắng vì kết là vị trí hiện tại gấp đôi liên tục nên luôn nghiêng đpas án về 1 phía
                System.out.println("Kosuke");
            }
        }
    }
}
