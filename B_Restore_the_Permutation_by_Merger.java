import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class B_Restore_the_Permutation_by_Merger {

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
            int[] a = new int[2 * n];

            for(int i = 0; i < 2 * n; i++){
                a[i] = sc.nextInt();
            }

            HashSet<Integer> find = new HashSet<>();
            //Tạo một HashSet để lưu các số đã xuất hiện.
            //HashSet là một cấu trúc không chứa phần tử trùng, giúp ta kiểm tra rất nhanh một số đã gặp hay chưa (O(1)).
            ArrayList<Integer> result = new ArrayList<>();

            for(int i = 0; i < 2 * n; i++){
                if(!find.contains(a[i])){// nếu như trong hashSet chứa p tử ! (khác) a[i] thì mới xuống dưới
                    find.add(a[i]);// lưu p tử chứa có trong hashSet vào hashSet
                    result.add(a[i]);// lưu vào danh sách resullt;
                }
            }

            for(int s : result){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
