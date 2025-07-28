import java.util.Scanner;

public class A_Pashmak_and_Garden {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3, x4, y3, y4;

        if(x1 == x2){// Cạnh vuông nằm dọc, ta xây hình vuông bằng cách đi sang ngang
            int d = Math.abs(y1 - y2);
            x3 = x1 + d;
            x4 = x2 + d;
            y3 = y1;
            y4 = y2;
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        }else if(y1 == y2){// Cạnh vuông nằm ngang, ta xây hình vuông bằng cách đi lên:
            int d = Math.abs(x1 - x2);
            x3 = x1;
            x4 = x2;
            y3 = y1 + d;
            y4 = y2 + d;
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        }else if(Math.abs(x1 - x2) == Math.abs(y1 - y2)){// Hai điểm tạo thành đường chéo hình vuông (đường chéo vuông góc):
            x3 = x1;
            x4 = x2;
            y3 = y2;
            y4 = y1;
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        }else{
            System.out.println("-1");
        }
    }
}
