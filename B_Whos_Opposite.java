import java.util.Scanner;

public class B_Whos_Opposite {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //input
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int temp = Math.abs(a - b); // khoảng cách giữa a và b
            int diff = 2 * temp;// tổng số người
            int result = c + temp;

            if(Math.max(a, Math.max(b, c)) > diff || diff == 0){
                System.out.println("-1");// nếu số người quá mức cho phép hoặc a == b => không hợp lệ
                continue;// đi đến vong lặp while tiếp theo
            }

            if(result > diff){// tìm người đối diện với c
                result -= diff; // nếu vượt n thì trừ đi n số người để trỏ đns người ở vị trí thừa ra lặp lại vòng
            }

            System.out.println(result);

        }
    }
}
