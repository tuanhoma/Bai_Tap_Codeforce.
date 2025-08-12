import java.util.Scanner;

public class A_Line_Breaks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();

            String[] a = new String[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLine();// nhập các dòng vào mảng
            }

            int sum = 0;
            int count = 0;
            for(int i = 0; i < n; i++){
                if(sum + a[i].length() <= m){
                    count++;// đếm số dòng cần cộng để lớn nhất mà <= m
                    sum += a[i].length();
                }else{
                    break;// ko thì break;
                }
            }

            System.out.println(count);
        }
    }
}
