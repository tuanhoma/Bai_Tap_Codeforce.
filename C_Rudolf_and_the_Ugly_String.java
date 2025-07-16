import java.util.Scanner;

public class C_Rudolf_and_the_Ugly_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String line = sc.nextLine();
            int count = 0;

            for (int i = 0; i <= n - 3; ) {
                String tmp = line.substring(i, i + 3);
                if (tmp.equals("pie") || tmp.equals("map")) {
                    count++;
                    i += 3; // bỏ qua 3 ký tự nếu như 3 kí tự hiện tại là chuỗi xấu tiếp theo để tránh trùng
                } else {
                    i++;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}
