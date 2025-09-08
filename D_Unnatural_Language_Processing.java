import java.util.Scanner;

public class D_Unnatural_Language_Processing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String word = sc.next();

            StringBuilder result = new StringBuilder();
            int i = 0;
            while (i < n) {
                if (n - i == 2) { // còn đúng 2 ký tự
                    result.append(word, i, i + 2);
                    i += 2;
                } else if (n - i == 3) { // còn đúng 3 ký tự
                    result.append(word, i, i + 3);
                    i += 3;
                } else { // còn >= 4 ký tự -> tách CV trước
                    result.append(word, i, i + 2);
                    i += 2;
                }
                if (i < n) result.append(".");
            }

            System.out.println(result);
        }
    }
}
