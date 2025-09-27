import java.util.Scanner;

public class A_Closest_Point {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            boolean found = false;
            for(int i = 0; i < n - 1; i++){
                if(a[i + 1] - a[i] == 1){
                    found = true;
                    break;
                }
            }

            if(found || n > 2){// nếu như khoảng cách giữa 2 ptu trong mảng là 1 và số lượng ptu trong mảng > 2 thì luôn không thể tìm ra dc cố thỏa mãn
                System.out.println("NO");
            }else{// nếu mảng chỉ có đúng 2 ptu và khoảng cách giữa 2 ptu đó > 1 thì luôn tìm dc số chèn ở giữa làm điểm gần nhất cho 2 ptu, vì đề bài cho mảng ít nhất là phải có 2 ptu thì chũng ta có thể luôn tìm dc khảng cách giữa chúng nếu mảng có 2 ptu
                System.out.println("YES");
            }
        }
    }
}
