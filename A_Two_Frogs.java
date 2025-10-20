import java.util.Scanner;

public class A_Two_Frogs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(Math.abs(a - b) % 2 == 0){// nếu khoảng cách giữa cả 2 là chăn thì alice luôn thắng
                System.out.println("YES");
            }else{// nếu khoảng cách giữa cả 2 là lẻ thì luôn thua
                System.out.println("NO");
            }
        }
    }
}

