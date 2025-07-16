import java.util.Scanner;

public class B_Swap_and_Delete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while (t-- > 0) {
            String line = sc.nextLine();
            int l = 0;
            int r = line.length() - 1;

            while (l < r && line.charAt(l) != line.charAt(r)) {
                l++;
                r--;
            }

            // Số ký tự cần xóa là phần còn lại không thể ghép
            int result = r - l + 1;
            System.out.println(result);
        }
    }
}