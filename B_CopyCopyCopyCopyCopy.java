import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class B_CopyCopyCopyCopyCopy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            HashSet<Integer> seen = new HashSet<>();
            // chính vì lặp và có thể xóa bất kì phần tử nào nên sẽ luôn có các phân ftuwr ko trùng được sắp xếp hoàn chỉnh
            // nên ta chỉ cần lấy các phần ưtr riêng biệt trong mảng và in ra số lượng phần tử đó là được
            // vì có thể ghép n mảng tương ứng với n phần tử 1 mảng nên sẽ luôn sắp xếp được ta chỉ cần tìm số lượng phân ftuwr riêng biệt là được
            for(int i = 0; i < n; i++){
                if(!seen.contains(a[i])){
                    seen.add(a[i]);
                }
            }

            System.out.println(seen.size());
        }
        sc.close();
    }
}
