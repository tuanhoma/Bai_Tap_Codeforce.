import java.util.HashSet;
import java.util.Scanner;

public class D_Distinct_Split {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String line = sc.nextLine();
            char[] a = line.toCharArray();

            int[] rightFreq = new int[26];
            for (int i = 0; i < n; i++) {
                rightFreq[a[i] - 'a']++;
            }

            int distinctRight = 0;
            for (int freq : rightFreq) {
                if (freq > 0) distinctRight++;
            }

            HashSet<Character> seen_a = new HashSet<>();
            int max = 0;

            for (int i = 0; i < n - 1; i++) {
                // Bên trái
                seen_a.add(a[i]);

                // Cập nhật bên phải
                rightFreq[a[i] - 'a']--;
                if (rightFreq[a[i] - 'a'] == 0) {
                    distinctRight--;
                }

                int temp = seen_a.size() + distinctRight;
                if (temp > max) {
                    max = temp;
                }
            }

            System.out.println(max);
        }
    }
}
