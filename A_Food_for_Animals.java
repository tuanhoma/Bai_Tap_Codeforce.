import java.util.Scanner;

public class A_Food_for_Animals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            x = x - a;
            y = y - b;

            if(x > 0){
                int min = Math.min(x, c);// tìm min của đồ ăn dùng chung và số chó còn lại
                x -= min;// trừ đi số động vật
                c -= min;// trừ đi số đồ ăn dùng chung
            }

            if(y > 0){
                int min = Math.min(y, c);// tìm min giữa số mèo còn lại và số thức ăn dùng chung
                y -= min;// trừ đi số mèo
                c -= min;// trừ đi số thức ăn dùng chung
            }

            if(x <= 0 && y <= 0){// nếu sô dộng vật = 0 hoặc bé hơn 0 thì in YES
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
