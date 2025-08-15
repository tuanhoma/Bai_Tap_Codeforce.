import java.util.Scanner;

public class B_Make_It_Increasing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            int count = 0;
            boolean possible = true;

            for (int i = n - 2; i >= 0; i--) {// duyệt tứ cuỗi mảng đến đầu mảng, phải sang trái
                while (a[i] >= a[i + 1] && a[i] > 0) {//phần while này dùng để giảm a[i] liên tục cho đến khi a[i] <= a[i + 1] thì mới dừng thoát khởi while
                    a[i] /= 2;
                    count++;
                }
                if (a[i] >= a[i + 1]) { // nếu như sau vòng while không thể làm nhỏ hơn a[i + 1] thì thoát ra in '-1', vd sau ki giảm hết nổi trong vòng while mà a[i] <= a[i + 1+ là a[i] = 0 thì luôn ko thể thỏa mã đề bài dc in ra '-1'
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? count : -1);// chỉ khi tất cả ptu trong mảng cs a[i] < a[i + 1] thì mới đúng
        }
    }
}
