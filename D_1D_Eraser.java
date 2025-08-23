import java.util.Scanner;

public class D_1D_Eraser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();

            String line = sc.nextLine();
            char[] a = line.toCharArray();
            int count_b = 0;
            for(int i = 0; i < a.length; i++){// đếm số lượng 'B' để trừ ở dưới
                if(a[i] == 'B'){
                    count_b++;
                }
            }

            int i = 0;
            int result = 0;
            while(true){
                if(i >= n) break;

                if(a[i] == 'B'){// mỗi cụm trừ liên tiếp này sẽ cộng số lần thay đổi
                    for(int j = 0; j < k && i < n; j++, i++){// j < k để đảm bảo tìm đoạn liên tiếp thỏa mãn, và i < n để đảm bảo ko vượt mảng vì nếu 'B' ở cuối mảng ko có điều kiện này nó sẽ cộng và ko điểm dừng làm quá mảng
                        if(a[i] == 'B'){
                            count_b--;
                        }
                    }
                    result++;// bởi vì khi gặp b nó sẽ tìm các kí tự liên tiếp <= k xem trong đoạn liên tiếp đó trừ đi dc ba0 nhiêu 'B' để khi gặp B thì mới phải dùng phương pháp trừ này để cộng số lần thao tác nếu như vẫn còn B vẫn phải thêm số lần thao tác
                }else{
                    i++;
                }
                if(count_b <= 0){
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
