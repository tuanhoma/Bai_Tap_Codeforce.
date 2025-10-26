import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class B_Squares_and_Cubes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // Tạo set để lưu các số Polycarp thích
        HashSet<Long> liked = new HashSet<>();

        // Thêm tất cả các số chính phương <= 1e9, tìm các số mũ 2
        for (long i = 1; i * i <= 1_000_000_000; i++) {
            liked.add(i * i);
        }

        // Thêm tất cả các số lập phương <= 1e9, tìm các số mũ 3
        for (long i = 1; i * i * i <= 1_000_000_000; i++) {
            liked.add(i * i * i);
        }

        // Chuyển set sang list và sắp xếp, nạp hết các số vừa tìm dc vào araylist và sắp xếp
        ArrayList<Long> list = new ArrayList<>(liked);
        Collections.sort(list);

        while(t-- > 0){
            long n = sc.nextLong();
            int count = 0;
            for (long x : list) {// đếm số lượng giá trị thỏa mãn mà <= n
                if (x <= n) count++;
                else break;
            }

            System.out.println(count);
        }
    }
}
