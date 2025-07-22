import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class A_Olympiad_Date {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] requiredDigits = {0, 1, 0, 3, 2, 0, 2, 5}; // cần tạo "01032025"
        Map<Integer, Integer> requiredFreq = new HashMap<>();// dùng để lưu các số và số lượng đề bài cần
        for (int digit : requiredDigits) {
            requiredFreq.put(digit, requiredFreq.getOrDefault(digit, 0) + 1);// nạp các số và số lần xuất hiện của chúng vào hashmap
        }

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            int answer = 0;
            HashMap<Integer, Integer> freq = new HashMap<>();// dùng để lưu sau mỗi lần nạp số vào để biết vị trí ít nhất cần nạp để bằng với hashmap ở trên

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);// nạp vào hash map
                // kiểm tra sau mỗi bước rút
                if (hasAllDigits(freq, requiredFreq)) {// gọi hàm kiểm tra nếu như chỉ cần trong freq đủ các ptu cần ktra thì sẽ đúng và break ngay lập tức, còn ko thì ko bao h true
                    answer = i + 1; // vị trí tính từ 1
                    break;
                }
            }

            System.out.println(answer);
        }
    }


    private static boolean hasAllDigits(Map<Integer, Integer> freq, Map<Integer, Integer> requiredFreq) {
        for (Map.Entry<Integer, Integer> entry : requiredFreq.entrySet()) {// chỉ cần freq thiếu 1 chữ số hay gì đó ko bằng với requierfreq thì trả về false, còn nếu chỉ cần đúng hết là trả về true và break in ra kết quả ngay
            int digit = entry.getKey();// digit là số cần kiểm tra
            int need = entry.getValue();// need là số lần xuất hiện của digits

            if (freq.getOrDefault(digit, 0) < need) {// nếu như ko tồn tại digit trong freq thì trả về 0, còn nếu như xuất hiện thì trả về value của key digit trong thằng freq
                return false;// nếu như < need thì trả về false luôn
            }
        }
        return true;
    }
}
