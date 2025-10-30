import java.util.Scanner;

public class A_Turtle_and_Good_Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String line = sc.nextLine();

            if(line.charAt(0) == line.charAt(line.length() - 1)){// kiểm tra xem kí tự đầu và cuỗi có bằng nhau hay ko
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
