import java.util.Scanner;

public class A_Square_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            String line = sc.nextLine();

            int tmp = Integer.parseInt(line);// chuyển chuỗi thành số int
            int x = (int)Math.sqrt(tmp);// lấy biến x là căn xủa tmp để kiểm tra xem có thỏa mãn điều kiển dưới ko
            if(x * x == tmp){// nếu như căn tmp là x, x * x bằng số ban đầu là tmp thì thỏa mãn
                System.out.println(0 + " " + x);
            }else{
                System.out.println("-1");
            }
        }
    }
}
