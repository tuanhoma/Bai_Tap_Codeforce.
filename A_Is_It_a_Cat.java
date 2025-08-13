import java.sql.SQLOutput;
import java.util.Scanner;

public class A_Is_It_a_Cat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();

            String line = sc.nextLine();
            line = line.toLowerCase();
            String result = "";

            char tmp = line.charAt(0);
            result += tmp;

            //dùng để tìm trong cả chuỗi dài nếu nếu tất cả các kí tự riêng lẻ, đúng bằng với chuỗi "meow" ko thừa ko thiếu thì đúng
            for(int i = 0; i < n; i++){
                if(tmp != line.charAt(i)){
                    result += "" + line.charAt(i);
                    tmp = line.charAt(i);
                }
            }

            if(result.equalsIgnoreCase("meow")){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
