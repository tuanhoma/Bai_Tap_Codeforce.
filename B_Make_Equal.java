import java.util.Scanner;

public class B_Make_Equal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }

            long avg = sum / n;// giá trị trung bình mỗi bình phải đạt
            long carry = 0; // lượng dư mang sang phải
            boolean ok = true;// cờ kiểm tra

            for (int i = 0; i < n; i++) {
                carry += a[i];// tông lượng nước của tất cả các bình ở các vị trí
                if (carry < (i + 1) * avg) {// (i + 1) * avg là điều kiện để tính trung bình của bình nước ở vị trí hiện tại nếu >= thì luôn đúng bởi vì mỗi bước đều cộng dồng bình nc ở từng vị trí nên như vậy mỗi bước sẽ biết và so sánh xem bình nc hiện tại có >= số nc trung bình hiện tại ko
                    ok = false;//Mà là so sánh tổng nước của cả cụm từ 1 đến i so với tổng nước cần thiết để tất cả cụm đó đạt trung bình. để thỏa mãn bài
                    break;
                }
            }

            if (ok) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
