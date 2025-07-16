import java.util.Scanner;
public class C_Wheres_the_Bishop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        //input
        input(sc, t);
        sc.close();
    }

    public static void input(Scanner sc, int t) {
        while(t-- > 0){
            int ping_i = 0;
            int ping_j = 0;
            int max = 0;
            char[][] a = new char[8][8];

            for(int i = 0; i < 8; i++){
                String line = sc.next();
                for(int j = 0; j < 8; j++){
                    a[i][j] = line.charAt(j);
                }
            }

            for(int i = 0; i < 8; i++){
                int count = 0;
                for(int j = 0; j < 8; j++){
                    if(a[i][j] == '#'){// đếm số lượng '#' trong hàng
                        count++;
                        ping_j = j + 1;
                        ping_i = i + 1;
                    }
                }

                if(count >= max){// duyệt từ đầu hàng max từ bé đến lớn
                    max = count;
                }else{// nếu như count < max thôi là ngắt ngay trương chình in ra vị trí
                    break;
                }
            }

            System.out.println(ping_i + " " + ping_j);
        }
    }
}
