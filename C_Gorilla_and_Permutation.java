import java.util.Scanner;

public class C_Gorilla_and_Permutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            /*5 1 2 3 4  của bạn sai rồi mục đích bài này là tìm hoán vị fi - gi lớn nhất mà, mà như bạn giải thích ở trên mỗi lần thỏa mãn vd fi có 5 >= k thì sau mỗi bước nó sẽ cộng thêm số mới và cộng lại chính nó
             và gi cũng tượng tự như vậy nên ở fi ta phải nhét các số lớn nhất là n ở đầu rồi giảm dần với điều kiện > m vì sau m tức là a[i] <= m là điều kiện của gi do là với quy tác cộng mợi và cộng lại chính nó
              nên với gi phải để số bé nhất ở đầu để đảm bảo output fi - gi luôn là lớn nhất
             */
            for(int i = n; i > m; i--){// lấy chuỗi lớn nhất của fi với điều kiện cộng số mới và cộng lại chĩnh nó nên phải cho số lớn nhất dc Cộng đầu tiên
                System.out.print(i + " ");
            }

            for(int i = 1; i <= m; i++){// lấy tổng bé nhất của gi với quy tác cộng số mới và cộng lại chính nó nên phải đặt số bé nhất ngay từ đầu để ra tổng bé nhất
                System.out.print(i + " ");
            }

            // sau đó ta sẽ có tổng lớn nhất trừ đi tổng bé nhất sẽ được tối ưu kết quả luôn lớn nhất
            System.out.println();
        }
    }
}
