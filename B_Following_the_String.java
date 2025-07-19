import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_Following_the_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            String result = "";
            Map<Character, Integer> freq = new HashMap<>();// khởi tạo hashset để lưu số lần xuất hiện của kí tự
            char tmp = 97;// khởi tạo kí tự đầu tiên = 'a'
            for(int i = 0; i < n; i++){
                if(a[i] == 0){// nếu chưa xuất hiện thì lưu 1 kí tự mới vào hashset và đếm sôs lần nó xuất hiện
                    result += tmp;
                    freq.put(tmp, freq.getOrDefault(tmp, 0) + 1);// gán kí tự mới vào hashset và để số lần xuất hiện đầu tiên là 1
                    tmp++;// cập nhật kí tự ban đầu thành kí tự khác
                }else if(a[i] > 0){// nếu a[i] > 0 là yêu cần kí tự đã xuất hiện trước đó số lần bằng a[i]
                    for (Map.Entry<Character, Integer> entry : freq.entrySet()) {// duyệt các kí tự đã lưu
                        if (entry.getValue() == a[i]) {// nếu số lần xuất hiện của kí tự = a[i]
                            result += entry.getKey();// thêm kí tự lặp a[i] lần thỏa mãn vào chuỗi
                            freq.put(entry.getKey(), entry.getValue() + 1);// cập nhật số lần xuất hiện của kí tựu đó sau khi cộng vào chuỗi
                            break; // DỪNG ngay sau khi tìm được ký tự đúng tránh bị lỗi khi gặp các trường hợp tương tự
                        }
                    }
                }
            }

            System.out.println(result);
        }
    }
}
