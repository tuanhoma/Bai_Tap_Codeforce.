import java.util.*;

public class B_All_Distinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                set.add(a[i]);
            }
            int unique = set.size();
            int duplicates = n - unique;

            if (duplicates % 2 == 0) {// Nếu số phần tử bị trùng là chẵn → ta có thể xóa hết thành từng cặp mà không ảnh hưởng đến độ dài tối đa.
                /*vd các số trùng còn dư ra sau khi bỏ số gốc là [2, 2, 3, 3]
                thì ta có thể xóa (2, 3) (2, 3) vậy là đã hết phần tử lặp chỉ còn mảng ban đầu chứa các ptu khác nhau;*/
                System.out.println(unique);
            } else {// Nếu lẻ, sẽ luôn dư lại 1 phần tử trùng → buộc phải xóa thêm một phần tử khác nhau để giữ mảng không bị trùng.
                /* vd các số trùng còn dư ra sau khi bỏ số gốc là [2, 2, 3, 3, 4]
                ta có thể xóa (2, 2) (3, 3) thừa 4 thì 4 với trừ với 1 phần tử ko lặp nên mảng ban đầu chứa các ptu khác nhau trừ đi 1;*/
                System.out.println(unique - 1);
            }
        }
    }
}
