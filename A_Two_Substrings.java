import java.util.Scanner;

public class A_Two_Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int ab = s.indexOf("AB");
        int ba = s.indexOf("BA");

        // "AB" trước, tìm "BA" sau không chồng
        if (ab != -1 && s.indexOf("BA", ab + 2) != -1) {
            System.out.println("YES");
            return;
        }

        // "BA" trước, tìm "AB" sau không chồng
        if (ba != -1 && s.indexOf("AB", ba + 2) != -1) {
            System.out.println("YES");
            return;
        }

        // Không có cặp không chồng nhau
        System.out.println("NO");
    }
}