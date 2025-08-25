import java.util.HashSet;
import java.util.Scanner;

public class A_Musical_Puzzle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String line = sc.nextLine();
            HashSet<String> a = new HashSet<>();

            for(int i = 0; i < n - 1; i++){
                String tmp = "" + line.charAt(i) + line.charAt(i + 1);
                if(!a.contains(tmp)){// lưu các cặp chuỗi liên tiếp 2 kí tự riêng biệt
                    a.add(tmp);
                }
            }

            System.out.println(a.size());
        }
    }
}
