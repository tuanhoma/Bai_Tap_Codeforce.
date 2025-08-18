import java.util.Scanner;

public class B_Lovely_Palindromes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // chuỗi palindromes là là khi duyệt tham lam 2 số đó bằng nhau vd: 123321
        String line = sc.nextLine();// nhập chuỗi ban đầu
        String line2 = "";// string temp line2

        // đảo ngược chuỗi line 2 để kết hợp với chuỗi chính
        StringBuilder tmp = new StringBuilder(line);
        line2 = tmp.reverse().toString();

        // kết hợp chuỗi gốc và chuỗi đảo vào chuỗi chính để in ra
        String result = line + line2;
        System.out.println(result);
    }
}
