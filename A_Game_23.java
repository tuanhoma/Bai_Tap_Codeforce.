import java.util.Scanner;

public class A_Game_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(m % n != 0){// nếu m không chia hết cho n
            System.out.println("-1");
        }else{// nếu như m chia hết cho n
            int x = m / n;// x là m chia cho n
            int count = 0;

            while (x % 2 == 0) {// đầu tiên là chia hết cho 2 cho đến khi ko chia dc hết mà bị dư thì ngắt
                x /= 2;
                count++;
            }

            while (x % 3 == 0) {// sau khi chia cho 2 bị dư thì bắt đầu đến chia cho 3 cho đến khi, chia 3 bị dư
                x /= 3;
                count++;
            }

            if (x != 1) {// nếu sau khi chia hết cho 2 và 3 đến khi ko chia hết được nữa và bị dư mà x ko về 1 thì in ra -1
                System.out.println("-1");
            } else {
                System.out.println(count);
            }
        }
    }
}
