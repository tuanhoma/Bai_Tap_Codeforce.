import java.util.Scanner;

public class B_Long_Long {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            long sum = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += Math.abs(a[i]);
            }

            boolean found_am = false;// biến đúng sai kiểm tra
            int count = 0;// biến đếm số lần cần chuyển âm thành dương
            for(int i = 0; i < n; i++){
                if(a[i] < 0 && !found_am){// nếu như là âm thì đánh dấu cộng 1 lần nếu gặp lại là âm thì không cộng nữa, khi nào gặp dương thì mới reset
                    count++;
                    found_am = true;
                }else if(a[i] > 0 && found_am){// reset lại biến đánh dấu khi gặp giá trị dương
                    found_am = false;
                }
            }

            System.out.println(sum + " " + count);
        }
    }
}
