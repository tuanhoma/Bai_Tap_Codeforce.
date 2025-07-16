import java.util.HashSet;
import java.util.Scanner;

public class B_Seating_in_a_Bus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //input
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while (t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            boolean found = false;
            // lưu giá trị a[i] tại thời gian thực khi nào có a[i mới lưu chứ ko lưu trc như mảng
            HashSet<Integer> seating = new HashSet<>();
            for(int i = 0; i < n; i++){
                int seat = a[i];
                if(i == 0){
                    seating.add(seat);
                    continue;
                }


                if(seating.contains(seat - 1) || seating.contains(seat + 1)){// kiểm tra xem giá trị liền kề của seat có ở cạnh ko,
                    // giá trị phải tuên thủ thao quy tắc này mới đúng(i - 1 <  i  < i + 1)
                    seating.add(seat);
                }else {
                    System.out.println("NO");
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("YES");
            }
        }
    }
}
