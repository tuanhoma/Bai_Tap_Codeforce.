import java.util.*;

public class C_Word_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            Set<String> s1 = new HashSet<>();
            Set<String> s2 = new HashSet<>();
            Set<String> s3 = new HashSet<>();

            // đọc từ của 3 người
            for (int i = 0; i < n; i++) s1.add(sc.next());
            for (int i = 0; i < n; i++) s2.add(sc.next());
            for (int i = 0; i < n; i++) s3.add(sc.next());

            // tập chứa tất cả từ
            Set<String> allWords = new HashSet<>();// là chứa tất cả có thể chứa trùng lặp
            allWords.addAll(s1);
            allWords.addAll(s2);
            allWords.addAll(s3);

            int a = 0, b = 0, c = 0;

            // duyệt qua tất cả từ duy nhất
            for (String w : allWords) {

                // đếm số lần lặp gặp lí tự
                // trog mỗi chuỗi các kí tự phải riêng biệt nên nhiều nhất chỉ có 3 kí tự giống nhau
                int cnt = 0;
                if (s1.contains(w)) cnt++;
                if (s2.contains(w)) cnt++;
                if (s3.contains(w)) cnt++;

                if (cnt == 1) {// nếu chỉ có 1 mình nó thì dc +3
                    if (s1.contains(w)) a += 3;
                    if (s2.contains(w)) b += 3;
                    if (s3.contains(w)) c += 3;
                } else if (cnt == 2) {// nếu có 2 thằng thì +1
                    if (s1.contains(w)) a += 1;
                    if (s2.contains(w)) b += 1;
                    if (s3.contains(w)) c += 1;
                }
                // cnt == 3 thì không ai được điểm
            }

            System.out.println(a + " " + b + " " + c);
        }
    }
}

